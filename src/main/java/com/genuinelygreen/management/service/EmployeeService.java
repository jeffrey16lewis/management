package com.genuinelygreen.management.service;

import com.genuinelygreen.management.domain.Employee;

import java.util.List;

public interface EmployeeService {

    List<Employee> list();

    Employee save(Employee employee);
}
