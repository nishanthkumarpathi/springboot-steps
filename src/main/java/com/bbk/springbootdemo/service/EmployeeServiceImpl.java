package com.bbk.springbootdemo.service;

import com.bbk.springbootdemo.model.Employee;
import org.springframework.stereotype.Service;

import com.bbk.springbootdemo.error.EmployeeNotFoundException;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    List<Employee> employees = new ArrayList<>();
    @Override
        public Employee save(Employee employee) {
            if(employee.getEmployeeId() == null || employee.getEmailId().isEmpty()) {
                employee.setEmployeeId(UUID.randomUUID().toString());
            }
            employees.add(employee);
            return employee;
        }

    @Override
        public List<Employee> getAllEmployees() {
            return employees;
        }

    @Override
    public Employee getEmployeeById(String id) {
        return employees
                .stream()
                .filter(employee -> employee.getEmployeeId().equalsIgnoreCase(id))
                .findFirst()
                .orElseThrow(() -> new EmployeeNotFoundException("" +
                        "Employee not found with Id: " + id));
    }

    // Test 1: You can use "EmployeeNotFoundException" for Testing
    // Test 2: "RuntimeException" for Testing for Generic Error Message


}
