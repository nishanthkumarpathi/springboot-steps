package com.bbk.springbootdemo.service;

import com.bbk.springbootdemo.model.Employee;
import org.springframework.stereotype.Service;

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
    public Employee getEmployeeById(String employeeId) {
        return employees
                .stream()
                .filter(employee -> employee.getEmployeeId().equals(employeeId))
                .findFirst()
                .orElseThrow(() -> new RuntimeException("Employee not found" + employeeId));
    }
}
