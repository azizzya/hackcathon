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
