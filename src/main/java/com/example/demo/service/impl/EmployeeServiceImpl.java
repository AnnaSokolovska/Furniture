package com.example.demo.service.impl;

import com.example.demo.dao.EmployeeDAO;
import com.example.demo.domain.Employee;
import com.example.demo.service.EmployeeService;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

/**
 * Created by Anna on 6/1/2017.
 */

@Service
@Transactional
public class EmployeeServiceImpl implements EmployeeService {

    private final EmployeeDAO employeeDAO;

    public EmployeeServiceImpl(EmployeeDAO employeeDAO) {
        this.employeeDAO = employeeDAO;
    }

    public void create(Employee employee){
        employeeDAO.save(employee);
    }

    public List<Employee> getAll(){
        return (List<Employee>) employeeDAO.findAll();
    }
}
