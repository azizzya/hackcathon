package com.cloudcom2024.store.dtos;

import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

import com.cloudcom2024.store.models.User;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Component
@Data
public class RegistrationFormRequest {
    final private PasswordEncoder passwordEncoder;

    public RegistrationFormRequest(PasswordEncoder passwordEncoder) {
        this.passwordEncoder = passwordEncoder;
    }

    @JsonProperty(value = "username")
    private String username;

    @JsonProperty(value = "firstname")
    private String firstname;

    @JsonProperty(value = "lastname")
    private String lastname;

    @JsonProperty(value = "fathername")
    private String fathername;

    @JsonProperty(value = "password")
    private String password;

    public User convertToUser() {
        String encodedPassword = passwordEncoder.encode(password);

        User user = new User();
        user.setUsername(username);
        user.setFirstname(firstname);
        user.setLastname(lastname);
        user.setFathername(fathername);
        user.setPassword(encodedPassword);
        return user;
    }
}
