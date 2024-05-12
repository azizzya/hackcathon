package com.cloudcom2024.store.daos;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonRootName;

import lombok.Data;

@Data
@JsonRootName(value = "choices")
public class MessageResponseDAO {
    private List<MessageDAO> messages;
}



