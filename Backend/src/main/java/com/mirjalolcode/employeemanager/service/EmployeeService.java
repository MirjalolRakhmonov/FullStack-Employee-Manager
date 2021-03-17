package com.mirjalolcode.employeemanager.service;

import com.mirjalolcode.employeemanager.model.Employee;
import com.mirjalolcode.employeemanager.repository.EmployeeRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
@AllArgsConstructor
public class EmployeeService {

    private final EmployeeRepository employeeRepository;

    public Employee addEmployee(Employee employee){
        employee.setEmployeeCode(UUID.randomUUID().toString());

        return employeeRepository.save(employee);
    }
}
