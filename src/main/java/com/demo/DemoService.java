package com.demo;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.HashMap;

@Service
public class DemoService {
    private Map<String, Object> cache = new HashMap<>();
    public void put(String k, Object v) { cache.put(k, v); }
    public Object get(String k) { return cache.get(k); }
    // auto-commit: () => Date.now()
}
