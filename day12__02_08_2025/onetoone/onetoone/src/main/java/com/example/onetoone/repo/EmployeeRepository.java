package com.example.onetoone.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.onetoone.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
