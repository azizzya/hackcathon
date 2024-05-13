package com.cloudcom2024.store.models;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Entity
@Table(name = "users")
@Data
public class User {
    @Id
    @GeneratedValue
    @Column(name = "user_id")
    private long userId;

    @NotNull
    @Column(name = "username")
    private String username;
    
    @NotNull
    @Column(name = "firstname")
    private String firstname;

    @NotNull
    @Column(name = "lastname")
    private String lastname;

    @Column(name = "fathername")
    private String fathername;

    @NotNull
    @Column(name = "password")
    private String password;

    @NotNull
    @Column(name = "coin_balance")
    private BigDecimal coinBalance;

    @NotNull
    @Column(name = "roles")
    private String roles;

    @Column(name = "email")
    private String email;

    @Column(name = "phone_number")
    private String phoneNumber;

    @OneToMany(mappedBy = "user", fetch = FetchType.EAGER)
    @JsonManagedReference
    private List<TaskDetail> taskDetails = new ArrayList<>();

    @OneToMany(mappedBy = "user", fetch = FetchType.EAGER)
    private List<Message> messages = new ArrayList<>();

    public void setTaskDetail(TaskDetail taskDetail) {
        taskDetails.add(taskDetail);
    }

    public void setMessage(Message message) {
        messages.add(message);
    }
}
