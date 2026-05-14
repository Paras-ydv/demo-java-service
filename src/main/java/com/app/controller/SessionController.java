package com.app.controller;

import org.springframework.web.bind.annotation.*;
import org.springframework.http.HttpStatus;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/api/sessions")
public class SessionController {
    private final SessionService service;

    @GetMapping
    public Flux<Session> streamAll() {
        return service.streamAll();
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Mono<Session> create(@RequestBody Session entity) {
        return service.create(entity);
    }
}