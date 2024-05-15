package com.cloudcom2024.store.services;

import java.util.List;
import java.util.Optional;
import java.util.Random;
import java.util.stream.Collectors;

import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.cloudcom2024.store.dtos.RegistrationFormRequest;
import com.cloudcom2024.store.dtos.UserResponse;
import com.cloudcom2024.store.models.TaskDetails;
import com.cloudcom2024.store.models.User;
import com.cloudcom2024.store.repositories.TaskDetailsRepository;
import com.cloudcom2024.store.repositories.UserRepository;
import com.cloudcom2024.store.utils.QRCodeGenerator;

import jakarta.security.auth.message.AuthException;

@Service
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
        TaskDetails randomGroupTask = getRandomGroupTask();
        long taskID = randomGroupTask.getTaskDetailsId();
        String friendUserName = randomGroupTask.getFriend().getUsername();

        String URL = String.format("%s:%d/tasks/complete?task_id=%d&friend_username=%s",
            "localhost", 5173, taskID, friendUserName);
        byte[] qrCode = null;
        try {
            QRCodeGenerator qrCodeGenerator = new QRCodeGenerator(URL, 320, 320);
            qrCode = qrCodeGenerator.generateByteQRCode();
        } catch (Exception ex) {}
        UserResponse user = userRepository.findUserByUsername(username).get()
            .convertToUserResponse();
        user.setQrCode(qrCode);
        return user;
    }

    private TaskDetails getRandomGroupTask() {
        Random rand = new Random();
        List<TaskDetails> groupTasks = getAllGroupTasks();
        TaskDetails randomGroupTask = groupTasks.get(rand.nextInt(groupTasks.size()));
        return randomGroupTask;
    }

    private List<TaskDetails> getAllGroupTasks() {
        return taskDetailsRepository.findAll().stream()
            .filter(x -> x.getFriend() != null)
            .toList();
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