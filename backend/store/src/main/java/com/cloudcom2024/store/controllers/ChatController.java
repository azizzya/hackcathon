package com.cloudcom2024.store.controllers;

import org.springframework.web.bind.annotation.RestController;

import com.cloudcom2024.store.dtos.ChatMessageRequest;
import com.cloudcom2024.store.dtos.ChatResponse;
import com.cloudcom2024.store.services.GigaChatService;

import lombok.extern.log4j.Log4j2;

import org.springframework.http.HttpHeaders;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;


@CrossOrigin(origins = "http://localhost:5173", allowCredentials = "true")
@RestController
@RequestMapping("/chat")
@Log4j2
public class ChatController {
    final private GigaChatService gigaChatService;

    public ChatController(GigaChatService gigaChatService) {
        this.gigaChatService = gigaChatService;
    }

    @PostMapping
    public ChatResponse getMessage(
        @RequestHeader(name = HttpHeaders.AUTHORIZATION) String authorization,
        @RequestBody ChatMessageRequest chatMessageRequest
    ) {
        chatMessageRequest.setUsernameFromBase64ToNormal(authorization);
        String message = gigaChatService.getMessage(chatMessageRequest);

        return ChatResponse.builder()
            .message(message)
            .build();
    }
}
