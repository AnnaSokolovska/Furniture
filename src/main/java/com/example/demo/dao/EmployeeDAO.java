package com.example.demo.dao;

import com.example.demo.domain.Employee;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by Anna on 6/1/2017.
 */
public interface EmployeeDAO extends CrudRepository<Employee,Long> {

}
