package com.cloudcom2024.store.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.cloudcom2024.store.models.Item;
import com.cloudcom2024.store.repositories.ItemRespository;

@Service
public class StoreService {
    final private ItemRespository postgresRespository;

    StoreService(ItemRespository postgresRespository) {
        this.postgresRespository = postgresRespository;
    }

    public List<Item> getAllItems() {
        return postgresRespository.findAll();
    }

    public Optional<Item> getItemByItemId(Long itemId) {
        return postgresRespository.findById(itemId);
    }
    
}
