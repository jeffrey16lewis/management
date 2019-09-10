package com.genuinelygreen.management.controller;

import com.genuinelygreen.management.domain.Employee;
import com.genuinelygreen.management.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/employee")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @GetMapping(value = {"", "/"})
    public List<Employee> listEmployees() {
        return this.employeeService.getEmployees();
    }

    @CrossOrigin
    @PostMapping("/save")
    public ResponseEntity<String> saveEmployee(@RequestBody Employee employee) {
        employeeService.save(employee);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
