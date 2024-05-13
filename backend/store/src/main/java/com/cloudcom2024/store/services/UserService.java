package com.cloudcom2024.store.services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.cloudcom2024.store.dtos.UserResponse;
import com.cloudcom2024.store.models.User;
import com.cloudcom2024.store.repositories.UserRepository;

@Service
public class UserService {
    final private UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public void saveUser(User user) {
        userRepository.save(user);
    }

    public List<UserResponse> getAllUsersSortByCoinBalanceDESCWithLimit100() {
        return userRepository.getAllUsersSortByCoinBalanceDESCWithLimit100().stream()
            .map(x -> x.convertToUserResponse())
            .collect(Collectors.toList());
    }
}
