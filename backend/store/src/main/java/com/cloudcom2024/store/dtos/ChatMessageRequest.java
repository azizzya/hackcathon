<<<<<<< HEAD
package com.cloudcom2024.store.dtos;

import com.cloudcom2024.store.daos.MessageDAO;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
public class ChatMessageRequest {
    @JsonIgnore
    private String username;

    @JsonProperty("role")
    private String role;

    @JsonProperty("message")
    private String message;

    public MessageDAO convertToMessageDAO() {
        MessageDAO messageDAO = new MessageDAO();
        messageDAO.setContent(message);
        messageDAO.setRole(role);

        return messageDAO;
    }
}
=======
package com.cloudcom2024.store.dtos;

import java.nio.charset.StandardCharsets;
import java.util.Base64;

import com.cloudcom2024.store.daos.MessageDAO;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
public class ChatMessageRequest {
    @JsonIgnore
    private String username;

    @JsonProperty("role")
    private String role;

    @JsonProperty("message")
    private String message;

    public void setUsernameFromBase64ToNormal(String authorizationCredentials) {
        String base64Credentials = authorizationCredentials.substring("Basic".length()).trim();
        byte[] credentialsDecoded = Base64.getDecoder().decode(base64Credentials);
        String credentialsStr = new String(credentialsDecoded, StandardCharsets.UTF_8);

        username = credentialsStr.split(":", 2)[0];
    }

    public MessageDAO convertToMessageDAO() {
        MessageDAO messageDAO = new MessageDAO();
        messageDAO.setContent(message);
        messageDAO.setRole(role);

        return messageDAO;
    }
}
>>>>>>> styles
