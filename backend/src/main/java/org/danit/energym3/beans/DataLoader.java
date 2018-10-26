package org.danit.energym3.beans;

import org.danit.energym3.entity.Department;

import org.danit.energym3.entity.Employee;
import org.danit.energym3.repositories.DepartmentRepository;
import org.danit.energym3.repositories.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Date;

@Configuration
public class DataLoader {
  @Autowired
  private EmployeeRepository employeeRepository;
  @Autowired
  private DepartmentRepository departmentRepository;

  @Bean
  CommandLineRunner init() {

    return (String... arg) -> {
      employeeRepository.save(new Employee("FirstName1", "LastName1", "FamilyName1"));
      employeeRepository.save(new Employee("FirstName2", "LastName2", "FamilyName2"));

      departmentRepository.save(new Department(null, "Energym 1", "Energym 1", new Date(), null, 0));
    };
  }

}
