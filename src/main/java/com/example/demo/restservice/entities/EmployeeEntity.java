package com.example.demo.restservice.entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="employee")
public class EmployeeEntity {
    @Id
    private Integer userid;
    private String username;

    public Integer getUserId() {
        return userid;
    }
    public String getUserName() {
        return username;
    }
}
