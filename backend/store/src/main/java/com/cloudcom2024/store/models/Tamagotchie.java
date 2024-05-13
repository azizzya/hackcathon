package com.cloudcom2024.store.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Entity
@Table(name = "tamagotchie")
@Data
public class Tamagotchie {
    @Id
    @GeneratedValue
    @Column(name = "tamagothie_id")
    private long tamagothieId;

    @NotNull
    @Column(name = "happiness")
    private long happiness;

    @NotNull
    @OneToOne
    @JoinColumn(name = "user_id")
    private User user;
}
