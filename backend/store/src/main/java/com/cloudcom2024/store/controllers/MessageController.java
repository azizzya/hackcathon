package com.cloudcom2024.store.controllers;

import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import org.springframework.http.HttpHeaders;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

import com.cloudcom2024.store.dtos.MessageResponse;
import com.cloudcom2024.store.models.Message;
import com.cloudcom2024.store.services.MessageService;
import com.cloudcom2024.store.utils.Base64Decoder;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;


@CrossOrigin(origins = "http://localhost:5173", allowCredentials = "true")
@RestController
@RequestMapping("/messages")
public class MessageController {
    final private MessageService messageService; 
    final private Base64Decoder base64Decoder;

    MessageController(
        MessageService messageService,
        Base64Decoder base64Decoder
    ) {
        this.messageService = messageService;
        this.base64Decoder = base64Decoder;
    }

    @GetMapping
    public List<MessageResponse> getAllMessages(
        @RequestHeader(name = HttpHeaders.AUTHORIZATION) String authorization
    ) {
        String username = base64Decoder.basicAuthDecoder(authorization)[0];

        return messageService.getAllMessagesByUsername(username).stream()
            .map(x -> x.convertToMessageResponse())
            .collect(Collectors.toList());
    }
}
