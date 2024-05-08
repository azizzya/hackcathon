package com.cloudcom2024.store.services;

import org.springframework.stereotype.Service;

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
}
