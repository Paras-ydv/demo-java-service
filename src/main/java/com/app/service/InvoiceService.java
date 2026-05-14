package com.app.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class InvoiceService {
    private final InvoiceRepository repository;
    private final EventPublisher eventPublisher;

    @Transactional
    public void processInvoice(String id) {
        var entity = repository.findById(id).orElseThrow();
        entity.process();
        repository.save(entity);
        eventPublisher.publish(new InvoiceProcessedEvent(entity));
    }
}