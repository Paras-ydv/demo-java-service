package com.demo;

import org.springframework.stereotype.Service;

@Service
public class DemoService {
    public String reverse(String s) {
        return new StringBuilder(s).reverse().toString();
    }
    // auto-commit: () => Date.now()
}
