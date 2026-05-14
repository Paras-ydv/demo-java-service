package com.app.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class ProductService {
    private final ProductRepository repository;
    private final EventPublisher eventPublisher;

    @Transactional
    public void processProduct(String id) {
        var entity = repository.findById(id).orElseThrow();
        entity.process();
        repository.save(entity);
        eventPublisher.publish(new ProductProcessedEvent(entity));
    }
}