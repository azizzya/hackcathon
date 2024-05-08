package com.cloudcom2024.store.models;

import java.math.BigDecimal;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "users")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class User {
    @Id
    @GeneratedValue
    @Column(name = "user_id")
    private long userId;

    @Column(name = "username")
    private String username;
    
    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "father_name")
    private String fatherName;

    @Column(name = "password")
    private String password;

    @Column(name = "coin_balance")
    private BigDecimal coinBalance;

    //@Column("tamagotchie_id")
    //private Long tamagothieId;

    @ManyToOne
    @JoinColumn(name = "task_detail_id")
    private TaskDetail taskDetail;

    @OneToOne
    @JoinColumn(name = "basket_id")
    private Basket basket;

    @Column(name = "roles")
    private String roles;
}
