package com.app.service;

import org.springframework.stereotype.Service;
import java.util.concurrent.CompletableFuture;
import java.util.List;

@Service
public class AccountService {
    private final AccountRepository repository;

    public AccountService(AccountRepository repository) {
        this.repository = repository;
    }

    public CompletableFuture<List<Account>> findAll() {
        return CompletableFuture.supplyAsync(() -> repository.findAll());
    }

    public Account save(Account entity) {
        return repository.save(entity);
    }
}