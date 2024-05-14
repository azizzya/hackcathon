package com.cloudcom2024.store.dtos;

import java.time.LocalDateTime;

import com.cloudcom2024.store.models.TaskDetails;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
public class TaskDetailRequest {
    @JsonIgnore
    private String currentUserUsername;

    @JsonProperty("task_id")
    private Long taskID;

    @JsonProperty("friend_username")
    private String friendUsername;
}
