package com.example.springbootthymeleafcrudwebapp.service;

import com.example.springbootthymeleafcrudwebapp.model.Employee;
import org.springframework.data.domain.Page;

import java.util.List;

public interface EmployeeService {

    List<Employee> getAllEmployees();
    void saveEmployee(Employee employee);
    Employee getEmployeeById(long id);
    void deleteEmployeeById(long id);
    //changed the method from only paging to also sorting by adding sortField and sortDirection(ASC,DESC)
    Page<Employee> findPaginated(int pageNo, int page, String sortField, String sortDirection);
}
