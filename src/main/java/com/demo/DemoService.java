package com.demo;

import org.springframework.stereotype.Service;
import java.util.concurrent.atomic.AtomicInteger;

@Service
public class DemoService {
    private AtomicInteger counter = new AtomicInteger(0);
    public int increment() { return counter.incrementAndGet(); }
    public int get() { return counter.get(); }
    // auto-commit: () => Date.now()
}
