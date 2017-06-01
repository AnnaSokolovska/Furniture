package com.example.demo.controller;

import com.example.demo.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @RequestMapping("/allEmployees")
    public ModelAndView allEmployees() {
        ModelAndView model = new ModelAndView("employees");
        model.addObject("employees", employeeService.getAll());
        return model;
    }

}