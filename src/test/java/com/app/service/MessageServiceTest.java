package com.app.service;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
class MessageServiceTest {
    @Mock
    private MessageRepository repository;

    @InjectMocks
    private MessageService service;

    @Test
    void testFindAll() {
        when(repository.findAll()).thenReturn(List.of());
        var result = service.findAll();
        assertNotNull(result);
        verify(repository).findAll();
    }
}