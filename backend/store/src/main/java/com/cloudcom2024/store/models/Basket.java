package com.cloudcom2024.store.models;

import java.math.BigDecimal;
import java.util.Set;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "baskets")
@Data
public class Basket {
    @Id
    @GeneratedValue
    @Column(name = "basket_id")
    private long basketId;
    
    @Column(name = "total_price")
    private BigDecimal totalPrice;

    @OneToOne
    @JoinColumn(name = "user_id")
    private User user;

    @ManyToMany
    @JoinTable (
        name = "baskets_items",
        joinColumns = @JoinColumn(name = "item_id"),
        inverseJoinColumns = @JoinColumn(name = "basket_id")
    )
    private Set<Item> items;
}
