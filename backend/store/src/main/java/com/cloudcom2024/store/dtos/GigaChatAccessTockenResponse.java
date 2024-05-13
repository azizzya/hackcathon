package com.cloudcom2024.store.dtos;


import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
public class GigaChatAccessTockenResponse {
    @JsonProperty("access_token")
    private String accessToken;

    @JsonProperty("expires_at")
    private Date expiresAt;

    public boolean isTokenExpired() {
        LocalDate tokenExpiresDate = expiresAt
            .toInstant()
            .atZone(ZoneId.systemDefault())
            .toLocalDate();

        if (tokenExpiresDate.isAfter(LocalDate.now())) {
            return true;
        }
        return false;
    }
}
