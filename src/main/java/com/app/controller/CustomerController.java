package com.app.controller;

import org.springframework.web.bind.annotation.*;
import org.springframework.http.HttpStatus;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/api/customers")
public class CustomerController {
    private final CustomerService service;

    @GetMapping
    public Flux<Customer> streamAll() {
        return service.streamAll();
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Mono<Customer> create(@RequestBody Customer entity) {
        return service.create(entity);
    }
}