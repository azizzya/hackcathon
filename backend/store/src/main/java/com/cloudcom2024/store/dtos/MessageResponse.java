package com.cloudcom2024.store.dtos;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
public class MessageResponse {
    @JsonProperty("message_id")
    private long messageId;

    @JsonProperty("role")
    private String role;
    
    @JsonProperty("message")
    private String message;
}
