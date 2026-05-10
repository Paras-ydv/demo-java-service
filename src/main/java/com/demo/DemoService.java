package com.demo;

import org.springframework.stereotype.Service;

@Service
public class DemoService {
    public int add(int a, int b) { return a + b; }
    public int multiply(int a, int b) { return a * b; }
    // auto-commit: () => Date.now()
}
