package com.cloudcom2024.store.dtos;

import java.time.LocalDateTime;

import com.cloudcom2024.store.models.Task;
import com.cloudcom2024.store.models.User;
import com.fasterxml.jackson.annotation.JsonProperty;

public class TaskDetailResponse {
    @JsonProperty("task_details_id")
    private long taskDetailsId;

    @JsonProperty("task_deadline")
    private LocalDateTime taskDeadline;

    @JsonProperty("time_completed")
    private LocalDateTime timeCompletion;

    @JsonProperty("is_done")
    private boolean isDone;

    @JsonProperty("friend")
    private UserResponse friend;

    @JsonProperty("task")
    private TaskDetailResponse task;
}
