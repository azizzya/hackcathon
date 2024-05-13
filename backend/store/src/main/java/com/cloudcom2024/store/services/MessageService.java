package com.cloudcom2024.store.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.cloudcom2024.store.models.Message;
import com.cloudcom2024.store.repositories.UserRepository;

import lombok.extern.log4j.Log4j2;

@Service
@Log4j2
public class MessageService {
    final private UserRepository userRepository;

    MessageService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public List<Message> getAllMessagesByUsername(String username) {
        return userRepository.findUserByUsername(username).get()
            .getMessages();
    }
}
