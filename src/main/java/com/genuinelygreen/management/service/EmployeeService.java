package com.genuinelygreen.management.service;

import com.genuinelygreen.management.domain.Employee;
import com.genuinelygreen.management.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepo;

    public List<Employee> getEmployees() {
        return employeeRepo.findAll();
    }

    public void save(Employee employee) {
        employeeRepo.save(employee);
    }
}
