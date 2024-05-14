package com.cloudcom2024.store.exceptions;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = false)
public class AuthException extends RuntimeException {
    private String username;

    private String rawPassword;

    public AuthException(String message) {
        super(message);
    }

    public AuthException(String message, String username, String rawPassword) {
        super(message);
        this.username = username;
        this.rawPassword = rawPassword;
    }
}
