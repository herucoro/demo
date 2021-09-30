package com.example.demo.restservice.services;

import java.util.List;

import com.example.demo.restservice.repositories.MaterialRepository;
import com.example.demo.restservice.entities.MaterialEntity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MaterialService {
    @Autowired
    private MaterialRepository repo;

    public List<MaterialEntity> getAll() {
        return repo.findAll();
    }

}
