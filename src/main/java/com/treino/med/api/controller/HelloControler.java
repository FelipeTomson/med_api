package com.treino.med.api.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("Hello")
public class HelloControler {
    @GetMapping
    public String olaMundo() {
        return "Hello World Spring!";
    }
}