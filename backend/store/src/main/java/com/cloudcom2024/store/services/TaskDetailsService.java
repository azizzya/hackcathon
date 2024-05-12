package com.cloudcom2024.store.services;

import org.springframework.stereotype.Service;

import com.cloudcom2024.store.models.TaskDetail;
import com.cloudcom2024.store.repositories.TaskDetailsRepository;

@Service
public class TaskDetailsService {
    final private TaskDetailsRepository taskDetailsRepository;

    public TaskDetailsService(TaskDetailsRepository taskDetailsRepository) {
        this.taskDetailsRepository = taskDetailsRepository;
    }

    public TaskDetail partiallyUpdateTaskDetail(TaskDetail taskDetail) {
        boolean isExiststaskDetail = taskDetailsRepository.findById(taskDetail.getTaskDetailId()).isPresent();
        if (isExiststaskDetail) {
            return null;
        }
        return taskDetailsRepository.save(taskDetail);
    }

    public void deleteTaskDetailByID(Long taskDetailID) {
        taskDetailsRepository.deleteById(taskDetailID);
    }
}
