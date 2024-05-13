package com.cloudcom2024.store.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cloudcom2024.store.dtos.UserResponse;
import com.cloudcom2024.store.services.UserService;

@CrossOrigin(origins = "http://localhost:5173", allowCredentials = "true")
@RestController
@RequestMapping("/users")
public class UserController {
    final private UserService userService;

    UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/leadersboard")
    public List<UserResponse> getLeaderBoard() {
        return userService.getAllUsersSortByCoinBalanceDESCWithLimit100();
    }
}
