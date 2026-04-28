package com.aws13.backend;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api")
public class ApiController {

    @GetMapping("/health")
    public Map<String, String> health() {
        return Map.of("status", "ok");
    }

    @GetMapping("/data")
    public Map<String, Object> data() {
        return Map.of("items", List.of(
            Map.of("id", 1, "name", "item1"),
            Map.of("id", 2, "name", "item2"),
            Map.of("id", 3, "name", "item3")
        ));
    }
}
