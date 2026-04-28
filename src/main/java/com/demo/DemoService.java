package com.demo;

import org.springframework.stereotype.Service;

@Service
public class DemoService {
    public double calculate(double x, double y) {
        return Math.sqrt(x * x + y * y);
    }
    // auto-commit: () => Date.now()
}
