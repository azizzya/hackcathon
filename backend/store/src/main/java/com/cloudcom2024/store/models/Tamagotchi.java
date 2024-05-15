package com.cloudcom2024.store.models;

import com.cloudcom2024.store.dtos.TamagotchiResponse;

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
@Table(name = "tamagotchi")
@Data
public class Tamagotchi {
    @Id
    @GeneratedValue
    @Column(name = "tamagothi_id")
    private long tamagothieId;

    @NotNull
    @Column(name = "happiness")
    private long happiness;

    @NotNull
    @OneToOne
    @JoinColumn(name = "user_id")
    private User user;

    public TamagotchiResponse convertToTamagotchiResponse() {
        TamagotchiResponse tamagotchiResponse = new TamagotchiResponse();
        tamagotchiResponse.setHappiness(happiness);
        tamagotchiResponse.setTamagitchiID(tamagothieId);

        return tamagotchiResponse;
    }
}
