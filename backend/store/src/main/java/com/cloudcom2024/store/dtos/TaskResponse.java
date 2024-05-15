package com.cloudcom2024.store.dtos;

import java.math.BigDecimal;
import java.time.Duration;

import com.fasterxml.jackson.annotation.JsonProperty;

public class TaskResponse {
    @JsonProperty("task_id")
    private long taskId;

    @JsonProperty("title")
    private String title;

    @JsonProperty("coin_reward")
    private BigDecimal coinReward;

    @JsonProperty("description")
    private String description;

    @JsonProperty("task_to_complete")
    private Duration taskToComplete;
}
