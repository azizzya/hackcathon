package com.cloudcom2024.store.daos;

import com.cloudcom2024.store.models.Message;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
public class MessageDAO {
    @JsonProperty("role")
    private String role;

    @JsonProperty("content")
    private String content;

    public Message convertToMessage() {
        Message message = new Message();
        message.setRole(role);
        message.setMessage(content);

        return message;
    }
}