package com.app.service;

import org.springframework.stereotype.Service;
import java.util.concurrent.CompletableFuture;
import java.util.List;

@Service
public class PaymentService {
    private final PaymentRepository repository;

    public PaymentService(PaymentRepository repository) {
        this.repository = repository;
    }

    public CompletableFuture<List<Payment>> findAll() {
        return CompletableFuture.supplyAsync(() -> repository.findAll());
    }

    public Payment save(Payment entity) {
        return repository.save(entity);
    }
}