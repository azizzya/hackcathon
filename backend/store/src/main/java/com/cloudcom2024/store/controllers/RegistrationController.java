package com.cloudcom2024.store.controllers;

import org.springframework.web.bind.annotation.RestController;

import com.cloudcom2024.store.dtos.RegistrationFormRequest;
import com.cloudcom2024.store.services.UserService;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@CrossOrigin(origins = "http://localhost:5173", allowCredentials = "true")
@RestController
@RequestMapping("/register")
public class RegistrationController {
    private UserService userDetailsService;
    
    public RegistrationController(UserService userDetailsService) {
        this.userDetailsService = userDetailsService;
    }

    @PostMapping
    public void processRegistration(@RequestBody RegistrationFormRequest registrationForm) {
        userDetailsService.saveUser(registrationForm.convertToUser());
    }
}
