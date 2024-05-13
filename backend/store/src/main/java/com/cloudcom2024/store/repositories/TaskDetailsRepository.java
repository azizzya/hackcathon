package com.cloudcom2024.store.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.cloudcom2024.store.models.TaskDetail;

@Repository
public interface TaskDetailsRepository extends CrudRepository<TaskDetail, Long> {
    List<TaskDetail> findAll();
} 