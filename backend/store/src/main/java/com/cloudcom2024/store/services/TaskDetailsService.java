package com.cloudcom2024.store.services;

import java.util.List;
import java.util.Optional;
import java.util.Random;

import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cloudcom2024.store.dtos.TaskDetailRequest;
import com.cloudcom2024.store.exceptions.TaskDetailNotFoundException;
import com.cloudcom2024.store.models.TaskDetails;
import com.cloudcom2024.store.models.User;
import com.cloudcom2024.store.repositories.TaskDetailsRepository;
import com.cloudcom2024.store.repositories.UserRepository;

@Service
public class TaskDetailsService {
    final private TaskDetailsRepository taskDetailsRepository;
    final private UserRepository userRepository;

    public TaskDetailsService(
        TaskDetailsRepository taskDetailsRepository,
        UserRepository userRepository
    ) {
        this.taskDetailsRepository = taskDetailsRepository;
        this.userRepository = userRepository;
    }

    public void setTaskIsDoneByTaskID(Long taskID) {
        boolean isTaskDetailExists = taskDetailsRepository.findById(taskID).isPresent();
        if (!isTaskDetailExists) {
            throw new TaskDetailNotFoundException("task detail not found", taskID);
        }

        taskDetailsRepository.setTaskIsDone(taskID);

        //if (!hasUserAnyActiveTask(taskDetailRequest.getUsername())) {
            //List<Long> allTaskDetailsIDs = taskDetailsRepository.findAll().stream()
                //.map(x -> x.getTaskDetailsId())
                //.toList();
            //List<Long> allTaskDetailsIDsToBeIngored = userRepository.findUserByUsername(taskDetailRequest.getUsername()).get()
                //.getTaskDetails().stream()
                    //.map(x -> x.getTaskDetailsId())
                    //.toList();
            //allTaskDetailsIDs.removeAll(allTaskDetailsIDsToBeIngored);
            //Random rand = new Random();
            //long randomAvailableTaskID = allTaskDetailsIDs.get(rand.nextInt(allTaskDetailsIDs.size()));
            //taskDetailsRepository.findById(randomAvailableTaskID);

            //giveUserARandomTask(taskDetailRequest.getUsername());
        //}
    }

    private boolean hasUserAnyActiveTask(String username) {
        List<TaskDetails>  userTasks = userRepository.findUserByUsername(username).get()
            .getTaskDetails();

        for (TaskDetails userTask: userTasks) {
            if (!userTask.isDone()) {
                return true;
            }
        }
        return false;

    }

    public void deleteTaskDetailByID(Long taskDetailID) {
        taskDetailsRepository.deleteById(taskDetailID);
    }

    public List<TaskDetails> getAllTaskDetailsByUsername(String username) {
        return userRepository.findUserByUsername(username).get()
            .getTaskDetails();
    }

    @Transactional
    public void setTaskIsDoneForCurrentUserAndFriend(
        String currentUserUsername,
        String friendUsername,
        Long taskDetailsID
    ) {
        Optional<User> currentUser = userRepository.findUserByUsername(friendUsername);
        Optional<User> friendUser = userRepository.findUserByUsername(friendUsername);
        if (!currentUser.isPresent() || !friendUser.isPresent()) {
            throw new UsernameNotFoundException(String.format("user friend with username %s not found",
                friendUser.get().getUsername()));
        }
        Long currentUserID = currentUser.get().getUserId();
        Long friendUserID = friendUser.get().getUserId();
        taskDetailsRepository.setTaskDetailIsDoneByUserIDAndTaskID(currentUserID, taskDetailsID);
        taskDetailsRepository.setTaskDetailIsDoneByUserIDAndTaskID(friendUserID, taskDetailsID);
    }
}
