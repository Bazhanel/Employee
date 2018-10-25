package org.danit.energym3.beans;

import org.danit.energym3.entity.Employee;
import org.danit.energym3.repositories.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DataLoader {
  @Autowired
  private EmployeeRepository employeeRepository;
  @Bean
  CommandLineRunner init() {
    return arg -> {
      employeeRepository.save(new Employee("test","test","test"));
    };
  }

}
