package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class MyController {

    @GetMapping("/demo")
    public String demo(Model model) {
        String message = "Hello, Spring Boot with Thymeleaf!";
        List<String> items = Arrays.asList("Item 1", "Item 2", "Item 3");

        model.addAttribute("message", message);
        model.addAttribute("items", items);

        // Additional attributes for Thymeleaf expressions
        model.addAttribute("isVisible", true);
        model.addAttribute("number", 123);
        model.addAttribute("url", "https://www.example.com");
        model.addAttribute("date", new java.util.Date());
        Map<String, String> map = new HashMap<>();
        map.put("key1", "value1");
        map.put("key2", "value2");
        model.addAttribute("map", map);

        return "demo";
    }
}
