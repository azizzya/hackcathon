package com.cloudcom2024.store.dtos;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ChatResponse {
    @JsonProperty("message")
    private String message;
} 