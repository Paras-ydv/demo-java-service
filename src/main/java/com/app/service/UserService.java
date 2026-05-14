package com.app.service;

import org.springframework.stereotype.Service;
import java.util.concurrent.CompletableFuture;
import java.util.List;

@Service
public class UserService {
    private final UserRepository repository;

    public UserService(UserRepository repository) {
        this.repository = repository;
    }

    public CompletableFuture<List<User>> findAll() {
        return CompletableFuture.supplyAsync(() -> repository.findAll());
    }

    public User save(User entity) {
        return repository.save(entity);
    }
}