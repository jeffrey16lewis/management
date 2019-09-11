package com.genuinelygreen.management;

import com.genuinelygreen.management.domain.Employee;
import com.genuinelygreen.management.repository.EmployeeRepository;
import com.genuinelygreen.management.service.EmployeeService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class EmployeeServiceTest {

    @Mock
    private EmployeeRepository repo;

    @InjectMocks
    private EmployeeService service;

    @Test
    public void getEmployeesTest() {
        Employee employee = new Employee();
        employee.setEmpId(1L);
        employee.setFName("Jeff");
        employee.setLName("Lewis");
        employee.setCity("Columbus");
        employee.setState("GA");
        List<Employee> employees = new ArrayList<>();
        employees.add(employee);
        when(repo.findAll()).thenReturn(employees);
        assertEquals("Jeff", service.getEmployees().get(0).getFName());
        assertEquals("Lewis", service.getEmployees().get(0).getLName());
        assertEquals("Columbus", service.getEmployees().get(0).getCity());
        assertEquals("GA", service.getEmployees().get(0).getState());
    }

    @Test
    public void saveTest() {
        Employee employee = new Employee();
        employee.setEmpId(1L);
        employee.setFName("Jeff");
        employee.setLName("Lewis");
        employee.setCity("Columbus");
        employee.setState("GA");
        when(repo.save(any())).thenReturn(employee);
        service.save(employee);
        verify(repo, times(1)).save(employee);
    }
}
