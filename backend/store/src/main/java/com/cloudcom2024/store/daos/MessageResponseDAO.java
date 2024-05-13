package com.cloudcom2024.store.daos;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
public class MessageResponseDAO {
    @JsonProperty("choices")
    private List<ChoiceDAO> choices = new ArrayList<>();
}
