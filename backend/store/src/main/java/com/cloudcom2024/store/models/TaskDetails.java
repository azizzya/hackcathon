package com.cloudcom2024.store.models;

import java.time.LocalDateTime;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.fasterxml.jackson.annotation.JsonProperty;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "tasks_details")
@Data
public class TaskDetails {
    @Id
    @GeneratedValue
    @Column(name = "task_details_id")
    private long taskDetailsId;

    @Column(name = "task_deadline")
    private LocalDateTime taskDeadline;

    @Column(name = "time_completed")
    private LocalDateTime timeCompletion;

    @Column(name = "is_done")
    @JsonProperty("is_done")
    private boolean isDone;

    @ManyToOne
    @JoinColumn(name = "user_id")
    @JsonBackReference
    private User user;

    @ManyToOne
    @JoinColumn(name = "friend_id")
    private User friend;

    @ManyToOne
    @JoinColumn(name = "task_id")
    @JsonManagedReference
    private Task task;
}