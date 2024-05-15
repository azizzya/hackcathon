package com.cloudcom2024.store.daos;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
public class MessageWithParammetersDAO {
    @JsonProperty("temperature")
    private Float temperature;

    @JsonProperty("n")
    private Integer n;

    @JsonProperty("messages")
    private List<MessageDAO> messages = new ArrayList<>();

    @JsonProperty("model")
    final private String model = "GigaChat";

    final private boolean stream = false;

    public void setMessage(MessageDAO message) {
        messages.add(message);
    }
}