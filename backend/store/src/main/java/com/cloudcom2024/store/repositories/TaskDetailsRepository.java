<<<<<<< HEAD
package com.cloudcom2024.store.repositories;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.cloudcom2024.store.models.TaskDetails;

@Repository
public interface TaskDetailsRepository extends CrudRepository<TaskDetails, Long> {
    List<TaskDetails> findAll();

    @Modifying
    @Transactional
    @Query(
        value = "UPDATE tasks_details SET is_done = true WHERE task_details_id = ?1",
        nativeQuery = true
    )
    void setTaskIsDone(
        Long taskDetailID
    );

    @Modifying
    @Transactional
    @Query(
        value = "UPDATE tasks_details SET is_done = true WHERE user_id = ?1 AND task_details_id =?2",
        nativeQuery = true
    )
    void setTaskDetailIsDoneByUserIDAndTaskID(
        Long currentUsernameID,
        Long taskDetailsID
    );  
=======
package com.cloudcom2024.store.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.cloudcom2024.store.models.TaskDetail;

@Repository
public interface TaskDetailsRepository extends CrudRepository<TaskDetail, Long> {
    List<TaskDetail> findAll();
>>>>>>> styles
} 