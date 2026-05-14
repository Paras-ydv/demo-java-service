package com.app.service;

import org.springframework.stereotype.Service;
import java.util.concurrent.CompletableFuture;
import java.util.List;

@Service
public class InvoiceService {
    private final InvoiceRepository repository;

    public InvoiceService(InvoiceRepository repository) {
        this.repository = repository;
    }

    public CompletableFuture<List<Invoice>> findAll() {
        return CompletableFuture.supplyAsync(() -> repository.findAll());
    }

    public Invoice save(Invoice entity) {
        return repository.save(entity);
    }
}