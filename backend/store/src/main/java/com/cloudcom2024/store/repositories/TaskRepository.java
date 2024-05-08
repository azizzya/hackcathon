package com.cloudcom2024.store.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.cloudcom2024.store.models.Task;

public interface TaskRepository extends CrudRepository<Task, Long> {
    List<Task> findAll();
}
