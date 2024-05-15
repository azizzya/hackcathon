package com.cloudcom2024.store.services;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.cloudcom2024.store.dtos.RegistrationFormRequest;
import com.cloudcom2024.store.dtos.UserResponse;
import com.cloudcom2024.store.models.User;
import com.cloudcom2024.store.repositories.UserRepository;

import jakarta.security.auth.message.AuthException;

@Service
public class UserService {
    final private UserRepository userRepository;
    final private PasswordEncoder passwordEncoder;

    public UserService(
        UserRepository userRepository,
        PasswordEncoder passwordEncoder
    ) {
        this.userRepository = userRepository;
        this.passwordEncoder = passwordEncoder;
    }

    public void saveUser(User user) {
        userRepository.save(user);
    }

    public List<UserResponse> getAllUsersSortByCoinBalanceDESCWithLimit100() {
        return userRepository.getAllUsersSortByCoinBalanceDESCWithLimit100().stream()
            .map(x -> x.convertToUserResponse())
            .collect(Collectors.toList());
    }

    public User getUserByUsername(String username) {
        Optional<User> user = userRepository.findUserByUsername(username);
        return user.get();
    }

    public User authUser(RegistrationFormRequest registrationFormRequest) throws AuthException {
        Optional<User> user = userRepository.findUserByUsername(registrationFormRequest.getUsername());
        if (user.isPresent()) {
            String rawPassword = registrationFormRequest.getPassword();
            String encodedPassword = user.get().getPassword();
            if (passwordEncoder.matches(rawPassword, encodedPassword)) {
                return user.get();
            }
        }
        throw new AuthException("authentication failed wrong password or username");
    }
}