package com.genuinelygreen.management;

import com.genuinelygreen.management.domain.Employee;
import com.genuinelygreen.management.service.EmployeeService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.time.LocalDate;

@SpringBootApplication
public class ManagementApplication {

    public static void main(String[] args) {
        SpringApplication.run(ManagementApplication.class, args);
    }

    @Bean
    CommandLineRunner runner(EmployeeService employeeService){
        return  args -> {
            employeeService.save(new Employee(1L, "Jeff", "Lewis","100 Calibre Creek Pkwy","Roswell", "GA", "30076","jeffrey16lewis@yahoo.com","254-383-7046",LocalDate.of(1983,07,16)));
            employeeService.save(new Employee(2L, "Carl", "Lewis","1017 Fellowship Rd","Fairburn", "GA", "30213","carlewis@yahoo.com","254-377-7077",LocalDate.of(1985,07,15)));
        };
    }

}
