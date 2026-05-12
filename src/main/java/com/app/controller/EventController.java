package com.app.controller;

import org.springframework.web.bind.annotation.*;
import org.springframework.http.HttpStatus;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/api/events")
public class EventController {
    private final EventService service;

    @GetMapping
    public Flux<Event> streamAll() {
        return service.streamAll();
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Mono<Event> create(@RequestBody Event entity) {
        return service.create(entity);
    }
}