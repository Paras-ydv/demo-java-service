package com.app.service;

import org.springframework.stereotype.Service;
import java.util.concurrent.CompletableFuture;
import java.util.List;

@Service
public class AnalyticsService {
    private final AnalyticsRepository repository;

    public AnalyticsService(AnalyticsRepository repository) {
        this.repository = repository;
    }

    public CompletableFuture<List<Analytics>> findAll() {
        return CompletableFuture.supplyAsync(() -> repository.findAll());
    }

    public Analytics save(Analytics entity) {
        return repository.save(entity);
    }
}