package com.cloudcom2024.store.services;

import java.util.Optional;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.cloudcom2024.store.models.User;
import com.cloudcom2024.store.models.UserDetailsImpl;
import com.cloudcom2024.store.repositories.UserRepository;

@Service
public class SimpleUserDetailsService implements UserDetailsService {
    final private UserRepository userRepository;

    public SimpleUserDetailsService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Optional<User> user = userRepository.findUserByUsername(username);
        if (!user.isPresent()) {
            throw new UsernameNotFoundException(username);
        }
        return new UserDetailsImpl(user.get());
    }
}
