package com.demo;

import org.springframework.stereotype.Service;

@Service
public class DemoService {
    public boolean validate(String input) {
        return input != null && !input.isEmpty();
    }
    // auto-commit: () => Date.now()
}
