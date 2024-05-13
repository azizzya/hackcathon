package com.cloudcom2024.store.repositories;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.cloudcom2024.store.models.TaskDetail;

@Repository
public interface TaskDetailsRepository extends CrudRepository<TaskDetail, Long> {
    List<TaskDetail> findAll();

    @Modifying
    @Transactional
    @Query(
        value = "UPDATE tasks_details SET is_done = ?1 WHERE task_detail_id = ?2",
        nativeQuery = true
    )
    void updateTaskDetailIsDone(
        Boolean isDone,
        Long taskDetailID
    );
} 