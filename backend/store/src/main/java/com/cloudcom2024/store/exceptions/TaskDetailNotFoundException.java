package com.cloudcom2024.store.exceptions;

public class TaskDetailNotFoundException extends RuntimeException {
    private Long taskDetailID;

    public TaskDetailNotFoundException(String message, Long taskDetailID) {
        super(message);
        this.taskDetailID = taskDetailID;
    }

    public Long getTaskDetailID() {
        return taskDetailID;
    }
}
