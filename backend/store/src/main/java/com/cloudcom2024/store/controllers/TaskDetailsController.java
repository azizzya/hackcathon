<<<<<<< HEAD
package com.cloudcom2024.store.controllers;

import java.util.List;

import org.springframework.http.HttpHeaders;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

import com.cloudcom2024.store.dtos.TaskDetailRequest;
import com.cloudcom2024.store.models.TaskDetails;
import com.cloudcom2024.store.services.TaskDetailsService;
import com.cloudcom2024.store.utils.Base64Decoder;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.GetMapping;

@CrossOrigin(origins = "http://localhost:5173", allowCredentials = "true")
@RestController
@RequestMapping("/tasks/details")
public class TaskDetailsController {
    final private TaskDetailsService taskDetailsService;    
    final private Base64Decoder base64Decoder;

    public TaskDetailsController(
        TaskDetailsService taskDetailsRepository,
        Base64Decoder base64Decoder
    ) {
        this.taskDetailsService = taskDetailsRepository;
        this.base64Decoder = base64Decoder;
    }

    @PatchMapping("/complete")
    public void setTaskIsDone(
        @RequestHeader(name = HttpHeaders.AUTHORIZATION) String authorization,
        @RequestBody TaskDetailRequest taskDetailRequest
    ) {
        String currentUsername = base64Decoder.basicAuthDecoder(authorization)[0];
        String friendUsername = taskDetailRequest.getFriendUsername();
        Long taskID = taskDetailRequest.getTaskID();

        if (taskDetailRequest.getFriendUsername() != null){
            setTaskIsDoneForCurrentUserAndFriend(currentUsername, friendUsername, taskID);
        } else {
            taskDetailsService.setTaskIsDoneByTaskID(taskID);
        }
    }

    private void setTaskIsDoneForCurrentUserAndFriend(String currentUsername, String friendUsername, Long taskId) {
        taskDetailsService.setTaskIsDoneForCurrentUserAndFriend(currentUsername,
            friendUsername,
            taskId
        );
    }


    @GetMapping
    public List<TaskDetails> getAllTaskDetailsByUser(
        @RequestHeader(name = HttpHeaders.AUTHORIZATION) String authorization
    ) {
        String username = base64Decoder.basicAuthDecoder(authorization)[0];

        return taskDetailsService.getAllTaskDetailsByUsername(username);
    }
    
}
=======
package com.cloudcom2024.store.controllers;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cloudcom2024.store.dtos.TaskDetailRequest;
import com.cloudcom2024.store.models.TaskDetail;
import com.cloudcom2024.store.services.TaskDetailsService;

import org.springframework.web.bind.annotation.RequestMapping;

@CrossOrigin(origins = "http://localhost:5173", allowCredentials = "true")
@RestController
@RequestMapping("/tasks/details")
public class TaskDetailsController {
    final private TaskDetailsService taskDetailsService;    

    public TaskDetailsController(TaskDetailsService taskDetailsRepository) {
        this.taskDetailsService = taskDetailsRepository;
    }

    @PatchMapping("/{taskDetailId}")
    public TaskDetail partiallyUpdateTaskDetailByID(
        @PathVariable Long taskDetailID,
        @RequestBody TaskDetailRequest taskDetailRequest
    ) {
        TaskDetail taskDetail = taskDetailRequest.convertToTaskDetail(taskDetailID);
        return taskDetailsService.partiallyUpdateTaskDetail(taskDetail);
    }

    @DeleteMapping("/{taskDetailId}")
    public void deleteTaskDetailByID(@PathVariable Long taskDetailID) {
        taskDetailsService.deleteTaskDetailByID(taskDetailID);
    }
}
>>>>>>> styles
