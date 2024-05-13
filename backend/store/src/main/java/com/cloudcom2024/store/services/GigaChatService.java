package com.cloudcom2024.store.services;

import org.springframework.stereotype.Service;

import com.cloudcom2024.store.dtos.ChatMessageRequest;
import com.cloudcom2024.store.dtos.GigaChatAccessTockenResponse;
import com.cloudcom2024.store.processors.ChatMessageProccessor;

import lombok.extern.log4j.Log4j2;

@Service
@Log4j2
public class GigaChatService {
    final private ChatMessageProccessor chatMessageProccessor;

    public GigaChatService(ChatMessageProccessor chatMessageProccessor) {
        this.chatMessageProccessor = chatMessageProccessor;
    }

    public String getMessage(ChatMessageRequest chatMessageRequest) {
        GigaChatAccessTockenResponse token = chatMessageProccessor.getCurrentToken();
        if (token == null || token.isTokenExpired()) {
            chatMessageProccessor.updateToken();
        }

        return chatMessageProccessor.getMessage(chatMessageRequest);
    }
}
