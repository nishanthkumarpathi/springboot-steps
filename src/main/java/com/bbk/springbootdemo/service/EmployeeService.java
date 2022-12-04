package com.bbk.springbootdemo.service;

import com.bbk.springbootdemo.model.Employee;

import java.util.List;

public interface EmployeeService {

    Employee save(Employee employee);

    List<Employee> getAllEmployees();

    Employee getEmployeeById(String employeeId);

    String deleteEmployeeById(String employeeId);
}
