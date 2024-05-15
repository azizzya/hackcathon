package com.cloudcom2024.store.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.cloudcom2024.store.models.Message;

@Repository
public interface MessageRepository extends CrudRepository<Message, Long> {
} 