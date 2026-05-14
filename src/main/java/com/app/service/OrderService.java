package com.app.service;

import org.springframework.stereotype.Service;
import java.util.concurrent.CompletableFuture;
import java.util.List;

@Service
public class OrderService {
    private final OrderRepository repository;

    public OrderService(OrderRepository repository) {
        this.repository = repository;
    }

    public CompletableFuture<List<Order>> findAll() {
        return CompletableFuture.supplyAsync(() -> repository.findAll());
    }

    public Order save(Order entity) {
        return repository.save(entity);
    }
}