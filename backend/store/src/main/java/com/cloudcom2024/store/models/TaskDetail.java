package com.cloudcom2024.store.models;

import java.util.Date;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "tasks_details")
@Data
public class TaskDetail {
    @Id
    @GeneratedValue
    @Column(name = "task_detail_id")
    private long taskDetailId;

    @Column(name = "user_deadline")
    private Date userDeadline;

    @Column(name = "time_completed")
    private Date timeCompleted;

    @Column(name = "is_done")
    private boolean isDone;

    @ManyToOne
    @JoinColumn(name = "task_id")
    private Task task;

    @OneToMany(mappedBy = "taskDetail")
    private List<User> users;
}
