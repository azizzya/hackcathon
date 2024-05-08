package com.cloudcom2024.store.models;

import java.math.BigDecimal;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "tasks")
@Data
public class Task {
    @Id
    @GeneratedValue
    @Column(name = "task_id")
    private long taskId;

    @OneToMany(mappedBy = "task")
    private List<TaskDetail> taskDetails;

    @Column(name = "coin_amount")
    private BigDecimal coinAmount;

    @Column(name = "description")
    private String description;
}
