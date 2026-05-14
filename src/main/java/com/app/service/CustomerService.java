package com.app.service;

import org.springframework.stereotype.Service;
import java.util.concurrent.CompletableFuture;
import java.util.List;

@Service
public class CustomerService {
    private final CustomerRepository repository;

    public CustomerService(CustomerRepository repository) {
        this.repository = repository;
    }

    public CompletableFuture<List<Customer>> findAll() {
        return CompletableFuture.supplyAsync(() -> repository.findAll());
    }

    public Customer save(Customer entity) {
        return repository.save(entity);
    }
}