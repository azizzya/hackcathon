package com.cloudcom2024.store.dtos;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
public class TamagotchiResponse {
    @JsonProperty("tamagotchi_id") 
    private long tamagitchiID;

    @JsonProperty("happiness")
    private long happiness;
}