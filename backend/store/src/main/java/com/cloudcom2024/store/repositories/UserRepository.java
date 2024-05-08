package com.cloudcom2024.store.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.cloudcom2024.store.models.User;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {
    @Query(
        value = "SELECT * FROM users u WHERE u.username = ?1",
        nativeQuery = true
    )
    Optional<User> findUserByUsername(String username);
} 