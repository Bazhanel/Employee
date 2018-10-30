package org.danit.energym3.beans;

import org.danit.energym3.repositories.DepartmentRepository;
import org.danit.energym3.repositories.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DataLoader {
  @Autowired
  private EmployeeRepository employeeRepository;
  @Autowired
  private DepartmentRepository departmentRepository;

  @Bean
  CommandLineRunner init() {

    return (String... arg) -> {

    };
  }

}
