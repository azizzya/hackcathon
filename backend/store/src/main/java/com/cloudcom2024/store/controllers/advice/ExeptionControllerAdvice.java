package com.cloudcom2024.store.controllers.advice;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.cloudcom2024.store.dtos.ErrorDetails;
import com.cloudcom2024.store.exceptions.TaskDetailNotFoundException;

@RestControllerAdvice
public class ExeptionControllerAdvice {
    @ExceptionHandler(TaskDetailNotFoundException.class)
    public ResponseEntity<ErrorDetails> exceptionTaskDetailNotFoundHandler(TaskDetailNotFoundException ex) {
        ErrorDetails errorDetails = new ErrorDetails();
        errorDetails.setMessage(String.format("%s with id: %d", ex.getMessage(), ex.getTaskDetailID()));
        return ResponseEntity
            .badRequest()
            .body(errorDetails);
    }
    
}
