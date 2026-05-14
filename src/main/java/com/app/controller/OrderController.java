package com.app.controller;

import org.springframework.web.bind.annotation.*;
import org.springframework.http.HttpStatus;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/api/orders")
public class OrderController {
    private final OrderService service;

    @GetMapping
    public Flux<Order> streamAll() {
        return service.streamAll();
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Mono<Order> create(@RequestBody Order entity) {
        return service.create(entity);
    }
}