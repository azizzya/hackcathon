package com.cloudcom2024.store.controllers;

import org.springframework.web.bind.annotation.RestController;

import com.cloudcom2024.store.models.User;
import com.cloudcom2024.store.services.UserService;

import lombok.extern.log4j.Log4j2;

import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
@RequestMapping("/register")
@CrossOrigin(origins = "http://localhost:5173")
@Log4j2
public class RegistrationController {
    private UserService userDetailsService;
    private PasswordEncoder passwordEncoder;
    
    public RegistrationController(
        UserService userDetailsService,
        PasswordEncoder passwordEncoder
    ) {
        this.userDetailsService = userDetailsService;
        this.passwordEncoder = passwordEncoder;
    }

    @PostMapping
    public void processRegistration(@RequestBody User user) {
        String userPassword = passwordEncoder.encode(user.getPassword());
        user.setPassword(userPassword);
        log.info(user);
        userDetailsService.saveUser(user);
    }
}
