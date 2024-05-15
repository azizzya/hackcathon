package com.cloudcom2024.store.controllers;

import org.springframework.web.bind.annotation.RestController;

import com.cloudcom2024.store.dtos.ItemResponse;
import com.cloudcom2024.store.services.StoreService;

import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;


@CrossOrigin(origins = "http://localhost:5173", allowCredentials = "true")
@RestController
@RequestMapping("/store")
public class StoreController {
    final private StoreService storeService;

    StoreController(StoreService storeService) {
        this.storeService = storeService;
    }
    
    @GetMapping("/items")
    public List<ItemResponse> getAllItems() {
        return storeService.getAllItems().stream()
            .map(x -> x.convertToItemRequest())
            .collect(Collectors.toList());
    }
}
