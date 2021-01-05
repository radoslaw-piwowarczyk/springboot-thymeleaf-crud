package com.example.springbootthymeleafcrudwebapp.service;

import com.example.springbootthymeleafcrudwebapp.model.Employee;

import java.util.List;

public interface EmployeeService {

    List<Employee> getAllEmployees();
    void saveEmployee(Employee employee);
}
