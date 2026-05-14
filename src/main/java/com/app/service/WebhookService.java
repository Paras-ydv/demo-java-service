package com.app.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class WebhookService {
    private final WebhookRepository repository;
    private final EventPublisher eventPublisher;

    @Transactional
    public void processWebhook(String id) {
        var entity = repository.findById(id).orElseThrow();
        entity.process();
        repository.save(entity);
        eventPublisher.publish(new WebhookProcessedEvent(entity));
    }
}