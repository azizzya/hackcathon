package com.cloudcom2024.store.dtos;

import java.time.LocalDateTime;

import com.cloudcom2024.store.models.TaskDetail;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
public class TaskDetailRequest {
    @JsonProperty(value = "task_deadline")
    private LocalDateTime taskDeadline;

    @JsonProperty(value = "time_completion")
    private LocalDateTime timeCompletion;

    @JsonProperty(value = "is_done")
    private boolean isDone;

    public TaskDetail convertToTaskDetail(long taskDetailId) {
        TaskDetail taskDetail = new TaskDetail();
        taskDetail.setTaskDetailId(taskDetailId);
        taskDetail.setTaskDeadline(taskDeadline);
        taskDetail.setTimeCompletion(timeCompletion);
        taskDetail.setDone(isDone);

        return taskDetail;
    }
}
