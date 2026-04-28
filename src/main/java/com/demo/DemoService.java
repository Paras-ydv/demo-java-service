package com.demo;

import org.springframework.stereotype.Service;
import java.util.stream.Collectors;
import java.util.List;

@Service
public class DemoService {
    public List<String> filter(List<String> items, String prefix) {
        return items.stream().filter(s -> s.startsWith(prefix)).collect(Collectors.toList());
    }
    // auto-commit: () => Date.now()
}
