package com.cloudcom2024.store.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.cloudcom2024.store.models.TaskDetail;
import com.cloudcom2024.store.repositories.TaskDetailRepository;

@Service
public class TaskService {
    final private TaskDetailRepository taskDetailRepository;    

    public TaskService(TaskDetailRepository taskDetailRepository) {
        this.taskDetailRepository = taskDetailRepository;
    }

    public List<TaskDetail> getAllTaskDetails() {
        return taskDetailRepository.findAll();
    }

    public void deleteTaskDetailById(Long TaskDetailId) {
        taskDetailRepository.deleteById(TaskDetailId);
    }

    public void partiallyUpdateTaskDetail(TaskDetail taskDetail) {
        Long taskDetailId = taskDetail.getTaskDetailId();
        if (taskDetailRepository.findById(taskDetailId).isPresent()) {
            taskDetailRepository.save(taskDetail);
        }
    }
}
