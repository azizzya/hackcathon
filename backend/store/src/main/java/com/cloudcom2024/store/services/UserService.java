package com.cloudcom2024.store.services;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Random;
import java.util.Set;
import java.util.stream.Collectors;

import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.cloudcom2024.store.dtos.RegistrationFormRequest;
import com.cloudcom2024.store.dtos.UserResponse;
import com.cloudcom2024.store.exceptions.NoGroupTaskAvailableException;
import com.cloudcom2024.store.models.TaskDetails;
import com.cloudcom2024.store.models.User;
import com.cloudcom2024.store.repositories.TaskDetailsRepository;
import com.cloudcom2024.store.repositories.UserRepository;
import com.cloudcom2024.store.utils.QRCodeGenerator;

import jakarta.security.auth.message.AuthException;
import lombok.extern.log4j.Log4j2;

@Service
@Log4j2
public class UserService {
    final private UserRepository userRepository;
    final private TaskDetailsRepository taskDetailsRepository;
    final private PasswordEncoder passwordEncoder;

    public UserService(
        UserRepository userRepository,
        TaskDetailsRepository taskDetailsRepository,
        PasswordEncoder passwordEncoder
    ) {
        this.userRepository = userRepository;
        this.taskDetailsRepository = taskDetailsRepository;
        this.passwordEncoder = passwordEncoder;
    }

    public void saveUser(User user) {
        userRepository.save(user);
    }

    public List<UserResponse> getAllUsersSortByCoinBalanceDESCWithLimit100() {
        return userRepository.getAllUsersSortByCoinBalanceDESCWithLimit100().stream()
            .map(x -> x.convertToUserResponse())
            .collect(Collectors.toList());
    }

    public UserResponse getUserByUsername(String username) {
        List<TaskDetails> allGroupTasks = getAllGroupTasks();
        TaskDetails randomGroupTask = getRandomGroupTaskThatUserNeverDone(allGroupTasks);
        UserResponse user = userRepository.findUserByUsername(username).get()
            .convertToUserResponse();
        byte[] qrCode = null;
        if (randomGroupTask != null) {
            long taskID = randomGroupTask.getTaskDetailsId();
            String friendUsername = randomGroupTask.getFriend().getUsername();

            //qrCode = generateQRCodeWithURL("localhost", 5173, taskID, friendUsername);
            qrCode = generateQRCodeWithURL("localhost", 5173, taskID, username);
        }
        user.setQrCode(qrCode);
        return user;
    }

    private List<TaskDetails> getAllGroupTasks() {
        return taskDetailsRepository.findAll().stream()
            .filter(x -> x.getFriend() != null)
            .toList();
    }

    private TaskDetails getRandomGroupTaskThatUserNeverDone(List<TaskDetails> allGroupTasks) {
        Set<TaskDetails> visitedGroupTaskDetails = new HashSet<>(); 
        while (true) {
            TaskDetails task = getRandomGroupTask(allGroupTasks);
            visitedGroupTaskDetails.add(task);

            if (!task.isDone()) {
                return task;
            }

            if (visitedGroupTaskDetails.size() == allGroupTasks.size()) {
                return null;
            }
        }
    }

    private TaskDetails getRandomGroupTask(List<TaskDetails> allGroupTasks) {
        Random rand = new Random();
        int randomIndex = rand.nextInt(allGroupTasks.size());
        TaskDetails randomGroupTask = allGroupTasks.get(randomIndex);
        return randomGroupTask;
    }

    private byte[] generateQRCodeWithURL(String host, int port, long taskID, String friendUsername) {
        String URL = String.format("%s:%d/tasks/complete?task_id=%d&friend_username=%s",
            "localhost", 5173, taskID, friendUsername);
        byte[] qrCode = null;
        try {
            QRCodeGenerator qrCodeGenerator = new QRCodeGenerator(URL, 320, 320);
            qrCode = qrCodeGenerator.generateByteQRCode();
        } catch (Exception ex) {}
        return qrCode;
    }

    public User authUser(RegistrationFormRequest registrationFormRequest) throws AuthException {
        Optional<User> user = userRepository.findUserByUsername(registrationFormRequest.getUsername());
        if (user.isPresent()) {
            String rawPassword = registrationFormRequest.getPassword();
            String encodedPassword = user.get().getPassword();
            if (passwordEncoder.matches(rawPassword, encodedPassword)) {
                return user.get();
            }
        }
        throw new AuthException("authentication failed wrong password or username");
    }
}