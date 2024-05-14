package com.cloudcom2024.store.controllers;

import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cloudcom2024.store.dtos.RegistrationFormRequest;
import com.cloudcom2024.store.services.SimpleUserDetailsService;
import com.cloudcom2024.store.services.UserService;

import jakarta.security.auth.message.AuthException;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@CrossOrigin(origins = "http://localhost:5173", allowCredentials = "true")
@RestController
@RequestMapping("/auth")
public class AuthController {
    final private UserService userService;

    public AuthController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping
    public void authUser(@RequestBody RegistrationFormRequest registrationFormRequest) throws AuthException {
        userService.authUser(registrationFormRequest);
    }
    
}
