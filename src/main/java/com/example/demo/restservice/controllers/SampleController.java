package com.example.demo.restservice.controllers;

import com.example.demo.restservice.services.SampleService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleController {
    @Autowired
    SampleService sampleService;

    @GetMapping("/greetings")
    String getHello() {
        return sampleService.outputHello();
    }
}
