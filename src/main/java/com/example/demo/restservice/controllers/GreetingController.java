package com.example.demo.restservice.controllers;

import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

import com.example.demo.restservice.entities.EmployeeEntity;
import com.example.demo.restservice.services.EmployeeService;
import com.example.demo.restservice.services.Greeting;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {
    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    @Autowired
    private EmployeeService service;

    @GetMapping("/greeting")
    public Greeting greeting(@RequestParam(value = "name", defaultValue = "World") String name) {
        return new Greeting(counter.incrementAndGet(), String.format(template, name));
    }

    @GetMapping("/employee")
    public List<EmployeeEntity> employee() {
        return service.getAll();
    }

    @CrossOrigin
    @GetMapping("/employee/{number}")
    public EmployeeEntity employeeSelect(@PathVariable(value = "number") String number) {
        return service.getSelect(number);
    }
}
