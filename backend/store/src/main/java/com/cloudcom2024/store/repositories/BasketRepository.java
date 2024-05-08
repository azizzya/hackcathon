package com.cloudcom2024.store.repositories;

import org.springframework.data.repository.CrudRepository;

import com.cloudcom2024.store.models.Basket;

public interface BasketRepository extends CrudRepository <Basket, Long> {
    
} 