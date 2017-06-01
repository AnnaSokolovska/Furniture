package com.example.demo.service;

import com.example.demo.domain.Employee;

import java.util.List;

/**
 * Created by Anna on 6/1/2017.
 */
public interface EmployeeService {
    List<Employee> getAll();
    void create(Employee employee);
}
