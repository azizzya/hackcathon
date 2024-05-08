package com.cloudcom2024.store.models;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Entity
@Table(name = "users")
@Data
//@NoArgsConstructor
//@AllArgsConstructor
public class User {
    @Id
    @GeneratedValue
    @Column(name = "user_id")
    private long userId;

    @NotNull
    @Column(name = "username")
    private String username;
    
    @NotNull
    @Column(name = "first_name")
    private String firstName;

    @NotNull
    @Column(name = "last_name")
    private String lastName;

    @Column(name = "father_name")
    private String fatherName;

    @NotNull
    @Column(name = "password")
    private String password;

    @NotNull
    @Column(name = "coin_balance")
    private BigDecimal coinBalance;

    @NotNull
    @Column(name = "roles")
    private String roles;

    @OneToMany(mappedBy = "user")
    @JsonManagedReference
    private List<TaskDetail> taskDetails = new ArrayList<>();

    public void setTaskDetail(TaskDetail taskDetail) {
        taskDetails.add(taskDetail);
    }
}
