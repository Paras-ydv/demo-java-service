package com.app.service;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;
import java.util.Optional;

@Service
public class AccountService {
    private final AccountRepository repository;

    @Cacheable("items")
    public Optional<Account> findById(Long id) {
        return repository.findById(id);
    }

    public void deleteById(Long id) {
        repository.deleteById(id);
    }
}