package com.cloudcom2024.store.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.cloudcom2024.store.dtos.TaskDetailRequest;
import com.cloudcom2024.store.models.TaskDetail;
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

    public void updateTaskDetailIsDone(TaskDetailRequest taskDetailRequest) {
        //User user = userRepository.findUserByUsername(taskDetailRequest.getUsername()).get();
        //List<TaskDetail> userTaskDetails = user.getTaskDetails();

        taskDetailsRepository.updateTaskDetailIsDone(
            taskDetailRequest.isDone(),
            taskDetailRequest.getTaskDetailID()
        );
    }

    public void deleteTaskDetailByID(Long taskDetailID) {
        taskDetailsRepository.deleteById(taskDetailID);
    }

    public List<TaskDetail> getAllTaskDetailsByUsername(String username) {
        return userRepository.findUserByUsername(username).get()
            .getTaskDetails();
    }
}
