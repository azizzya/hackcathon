package com.cloudcom2024.store.daos;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
public class MessageDAO {
    @JsonProperty("role")
    private String role;

    @JsonProperty("content")
    private String content;
}