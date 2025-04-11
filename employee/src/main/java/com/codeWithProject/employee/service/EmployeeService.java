package com.codeWithProject.employee.service;

import com.codeWithProject.employee.repository.EmployeeRepository;
import com.codeWithProject.employee.entity.Employee;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class EmployeeService {

    private final EmployeeRepository employeeRepository;

    public EmployeeService(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    public Employee postEmployee(Employee employee) {
        return employeeRepository.save(employee);
    }
    public List<Employee> getAllEmployees(){
    return employeeRepository.findAll();
    }
}
