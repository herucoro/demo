package com.example.demo.restservice.services;

import java.util.List;

import com.example.demo.restservice.entities.EmployeeEntity;
import com.example.demo.restservice.repositories.EmployeeRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {
    @Autowired
    private EmployeeRepository repo;

    public List<EmployeeEntity> getAll() {
        return repo.findAll();
    }
}
