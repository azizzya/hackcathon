package com.cloudcom2024.store.utils;

import java.nio.charset.StandardCharsets;
import java.util.Base64;

import org.springframework.stereotype.Component;

@Component
public class Base64Decoder {
    public String[] basicAuthDecoder(String authorizationCredentials) {
        String base64Credentials = authorizationCredentials.substring("Basic".length()).trim();
        byte[] credentialsDecoded = Base64.getDecoder().decode(base64Credentials);
        String credetialsStr = new String(credentialsDecoded, StandardCharsets.UTF_8);
        return credetialsStr.split(":", 2);
    }
}
