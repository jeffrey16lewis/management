package com.genuinelygreen.management.repository;

import com.genuinelygreen.management.domain.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
