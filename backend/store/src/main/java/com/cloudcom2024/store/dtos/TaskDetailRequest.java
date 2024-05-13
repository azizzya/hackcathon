package com.cloudcom2024.store.dtos;

import java.time.LocalDateTime;

import org.springframework.stereotype.Component;

import com.cloudcom2024.store.models.TaskDetail;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
public class TaskDetailRequest {
    @JsonIgnore
    private String username;

    @JsonIgnore
    private Long taskDetailID;

    @JsonProperty(value = "task_deadline")
    private LocalDateTime taskDeadline;

    @JsonProperty(value = "time_completion")
    private LocalDateTime timeCompletion;

    @JsonProperty(value = "is_done")
    private boolean isDone;

    public TaskDetail convertToTaskDetail() {
        TaskDetail taskDetail = new TaskDetail();
        taskDetail.setTaskDetailId(taskDetailID);
        taskDetail.setTaskDeadline(taskDeadline);
        taskDetail.setTimeCompletion(timeCompletion);
        taskDetail.setDone(isDone);

        return taskDetail;
    }
}
