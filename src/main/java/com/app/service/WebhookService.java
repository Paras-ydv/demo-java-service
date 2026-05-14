package com.app.service;

import org.springframework.stereotype.Service;
import java.util.concurrent.CompletableFuture;
import java.util.List;

@Service
public class WebhookService {
    private final WebhookRepository repository;

    public WebhookService(WebhookRepository repository) {
        this.repository = repository;
    }

    public CompletableFuture<List<Webhook>> findAll() {
        return CompletableFuture.supplyAsync(() -> repository.findAll());
    }

    public Webhook save(Webhook entity) {
        return repository.save(entity);
    }
}