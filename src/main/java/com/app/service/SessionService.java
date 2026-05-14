package com.app.service;

import org.springframework.stereotype.Service;
import java.util.concurrent.CompletableFuture;
import java.util.List;

@Service
public class SessionService {
    private final SessionRepository repository;

    public SessionService(SessionRepository repository) {
        this.repository = repository;
    }

    public CompletableFuture<List<Session>> findAll() {
        return CompletableFuture.supplyAsync(() -> repository.findAll());
    }

    public Session save(Session entity) {
        return repository.save(entity);
    }
}