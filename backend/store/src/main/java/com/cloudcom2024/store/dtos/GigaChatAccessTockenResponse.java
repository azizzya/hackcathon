package com.cloudcom2024.store.dtos;

import java.time.LocalDateTime;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

public class GigaChatAccessTockenResponse {
    @JsonProperty("access_tocken")
    public String accessTocken;

    @JsonProperty("expires_at")
    public LocalDateTime expiresAt;
}
