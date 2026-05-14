package com.app.service;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class MessageServiceIntegrationTest {
    @Autowired
    private MessageService service;

    @BeforeEach
    void setUp() {
        // Setup test data
    }

    @Test
    void testServiceIntegration() {
        var result = service.findAll();
        assertNotNull(result);
    }
}