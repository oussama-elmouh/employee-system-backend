package com.codeWithProject.employee.controller;

import com.codeWithProject.employee.entity.Employee;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import com.codeWithProject.employee.service.EmployeeService;

import java.util.List;

@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
@CrossOrigin("*")
public class EmployeeController {


    private final EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @PostMapping("/employee")
    public Employee postEmployee(@RequestBody Employee employee){

        return employeeService.postEmployee(employee);
    }

    @GetMapping("/employees")
    public List<Employee> getAllEmployee(){
        return employeeService.getAllEmployees();
    }
}
