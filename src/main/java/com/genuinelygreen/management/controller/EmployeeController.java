package com.genuinelygreen.management.controller;

import com.genuinelygreen.management.domain.Employee;
import com.genuinelygreen.management.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/employee")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @GetMapping(value = {"", "/"})
    public List<Employee> listEmployees(){
        return this.employeeService.list();
    }

    @CrossOrigin
    @PostMapping("/save")
    public Employee saveEmployee(@RequestBody Employee employee){
        System.out.println(employee.getFName());
        return this.employeeService.save(employee);
    }
}
