package com.demo;

import org.springframework.stereotype.Service;
import java.util.List;
import java.util.ArrayList;

@Service
public class DemoService {
    private final List<String> log = new ArrayList<>();

    public void record(String msg) { log.add(msg); }
    public List<String> getLogs() { return log; }
    // auto-commit: () => Date.now()
}
