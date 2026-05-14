package com.app.controller;

import org.springframework.web.bind.annotation.*;
import org.springframework.http.HttpStatus;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/api/notifications")
public class NotificationController {
    private final NotificationService service;

    @GetMapping
    public Flux<Notification> streamAll() {
        return service.streamAll();
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Mono<Notification> create(@RequestBody Notification entity) {
        return service.create(entity);
    }
}