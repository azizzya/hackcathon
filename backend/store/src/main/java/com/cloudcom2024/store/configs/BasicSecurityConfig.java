package com.cloudcom2024.store.configs;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configurers.AbstractHttpConfigurer;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class BasicSecurityConfig {
    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }

    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
        return http
                .csrf(AbstractHttpConfigurer::disable)
                .cors(AbstractHttpConfigurer::disable)
                .authorizeHttpRequests(authorizeRequests ->
                    authorizeRequests
                        .requestMatchers("/register").hasRole("ADMIN")
                        .requestMatchers("/store/**").hasAnyRole("ADMIN", "USER")
                        .requestMatchers("/tasks/**").hasAnyRole("ADMIN", "USER")
                        .requestMatchers(
                            "/swagger-ui/**",
                            "v3/api-docs/**"
                        ).permitAll()
                )
                .httpBasic(Customizer.withDefaults())
                .build();
    }
}
