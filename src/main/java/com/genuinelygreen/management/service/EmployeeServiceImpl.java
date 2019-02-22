package com.genuinelygreen.management.service;

import com.genuinelygreen.management.domain.Employee;
import com.genuinelygreen.management.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepo;

    @Override
    public List<Employee> list() {
        return this.employeeRepo.findAll();
    }

    @Override
    public Employee save(Employee employee) {
        return this.employeeRepo.save(employee);
    }
}
