package com.example.onetoone.entity;

import jakarta.persistence.*;

@Entity
public class Department {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String deptName;

    public Department() {}
    public Department(String deptName) {
        this.deptName = deptName;
    }

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getDeptName() { return deptName; }
    public void setDeptName(String deptName) { this.deptName = deptName; }
}
