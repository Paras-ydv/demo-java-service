package com.demo;

import org.springframework.stereotype.Service;
import java.time.Instant;

@Service
public class DemoService {
    public String getStatus() {
        return "OK at " + Instant.now();
    }
    // auto-commit: () => Date.now()
}
