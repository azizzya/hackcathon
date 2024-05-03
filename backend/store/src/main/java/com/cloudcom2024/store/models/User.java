package com.cloudcom2024.store.models;

import java.math.BigDecimal;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "users")
public class User {
    @Id
    private long id;
    
    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "father_name")
    private String fatherName;

    @Column(name = "coin_balance")
    private BigDecimal coinBalance;

    //@Column("tamagotchie_id")
    //private Long tamagothieId;

    //@Column("task_id")
    //private Long taskId;

    @OneToOne
    @JoinColumn(name = "basket_id")
    private Basket basket;
}
