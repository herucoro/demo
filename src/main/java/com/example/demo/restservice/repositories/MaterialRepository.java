package com.example.demo.restservice.repositories;

import com.example.demo.restservice.entities.MaterialEntity;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MaterialRepository extends JpaRepository<MaterialEntity, Integer>{
    
}
