package com.demo;

import org.springframework.stereotype.Service;
import java.util.UUID;

@Service
public class DemoService {
    public String generateId() { return UUID.randomUUID().toString(); }
    // auto-commit: () => Date.now()
}
