package com.cloudcom2024.store.controllers;

import org.springframework.web.bind.annotation.RestController;

import com.cloudcom2024.store.proxies.GigaChatProxy;

import lombok.extern.log4j.Log4j2;

import java.util.UUID;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;


@CrossOrigin(origins = "http://localhost:5173", allowCredentials = "true")
@RestController
@RequestMapping("/chat")
@Log4j2
public class ChatController {
    final private GigaChatProxy gigaChatProxy;
    
    ChatController(GigaChatProxy gigaChatProxy) {
        this.gigaChatProxy = gigaChatProxy;
    }

    @PostMapping
    public void postMethodName() {
        String rqUID = UUID.randomUUID().toString();
        log.info(gigaChatProxy.createAccessTocken(
            "application/x-www-form-urlencoded",
            "application/json",
            rqUID,
            "MTJkNjE0NjgtYjAxYi00MmFmLWEyYTMtMDI2ZjBiMzViNzczOjAzNmFiNzZjLTU4NDAtNDNjZi04NjdmLWIwMjNlYzhiYWQ2Ng==",
            "GIGACHAT_API_PERS"
        ));
    }
    
}
