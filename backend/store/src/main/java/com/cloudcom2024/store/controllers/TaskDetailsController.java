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
import com.cloudcom2024.store.models.TaskDetail;
import com.cloudcom2024.store.services.TaskDetailsService;
import com.cloudcom2024.store.utils.Base64Decoder;

import org.springframework.web.bind.annotation.RequestMapping;
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

    @PatchMapping("/{taskDetailID}")
    public TaskDetail partiallyUpdateTaskDetailByID(
        @RequestHeader(name = HttpHeaders.AUTHORIZATION) String authorization,
        @PathVariable Long taskDetailID,
        @RequestBody TaskDetailRequest taskDetailRequest
    ) {
        String username = base64Decoder.basicAuthDecoder(authorization)[0];
        taskDetailRequest.setUsername(username);
        taskDetailRequest.setTaskDetailID(taskDetailID);

        taskDetailsService.updateTaskDetailIsDone(taskDetailRequest);
        return null;
    }

    @GetMapping
    public List<TaskDetail> getAllTaskDetailsByUser(
        @RequestHeader(name = HttpHeaders.AUTHORIZATION) String authorization
    ) {
        String username = base64Decoder.basicAuthDecoder(authorization)[0];

        return taskDetailsService.getAllTaskDetailsByUsername(username);
    }
    
}
