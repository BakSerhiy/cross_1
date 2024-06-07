package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Arrays;
import java.util.List;

@Controller
public class MyController {

    @GetMapping("/demo")
    public String demo(Model model) {
        String message = "Hello, Spring Boot with Thymeleaf!";
        List<String> items = Arrays.asList("Item 1", "Item 2", "Item 3");

        model.addAttribute("message", message);
        model.addAttribute("items", items);

        return "demo";
    }
}