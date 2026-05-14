package com.app.controller;

import org.springframework.web.bind.annotation.*;
import org.springframework.http.HttpStatus;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/api/messages")
public class MessageController {
    private final MessageService service;

    @GetMapping
    public Flux<Message> streamAll() {
        return service.streamAll();
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Mono<Message> create(@RequestBody Message entity) {
        return service.create(entity);
    }
}