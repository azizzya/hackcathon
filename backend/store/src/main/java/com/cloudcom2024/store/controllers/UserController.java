package com.cloudcom2024.store.controllers;

import java.util.List;

import org.bouncycastle.util.encoders.Base64Encoder;
import org.springframework.http.HttpHeaders;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cloudcom2024.store.dtos.UserResponse;
import com.cloudcom2024.store.models.User;
import com.cloudcom2024.store.services.UserService;
import com.cloudcom2024.store.utils.Base64Decoder;
import com.fasterxml.jackson.databind.JsonSerializable.Base;

import org.springframework.web.bind.annotation.RequestParam;


@CrossOrigin(origins = "http://localhost:5173", allowCredentials = "true")
@RestController
@RequestMapping("/users")
public class UserController {
    final private UserService userService;
    final private Base64Decoder base64Decoder;

    UserController(
        UserService userService,
        Base64Decoder base64Decoder
    ) {
        this.userService = userService;
        this.base64Decoder = base64Decoder;
    }

    @GetMapping("/leadersboard")
    public List<UserResponse> getLeaderBoard() {
        return userService.getAllUsersSortByCoinBalanceDESCWithLimit100();
    }

    @GetMapping
    public UserResponse getUserProfile(
        @RequestHeader(name = HttpHeaders.AUTHORIZATION) String authorization
    ) {
        String username = base64Decoder.basicAuthDecoder(authorization)[0];
        return userService.getUserByUsername(username).convertToUserResponse();
    }
    
}
