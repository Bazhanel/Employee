package org.danit.energym3.rest;

import org.danit.energym3.entity.Employee;
import org.danit.energym3.repositories.EmployeeRepository;
import org.danit.energym3.exceptions.EmployeeNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;
import java.util.Optional;

@RestController
public class EmployeeResource {
  @Autowired
  private EmployeeRepository employeeRepository;

  @GetMapping("/employee")
  public List<Employee> retrieveAllEmployee() {
    return employeeRepository.findAll();
  }

  @GetMapping("/employee/{id}")
  public Employee retrieveStudent(@PathVariable long id) {
    Optional<Employee> employee = employeeRepository.findById(id);

    if (!employee.isPresent())
      throw new EmployeeNotFoundException("id-" + id);

    return employee.get();
  }

  @DeleteMapping("/employee/{id}")
  public void deleteStudent(@PathVariable long id) {
    employeeRepository.deleteById(id);
  }

  @PostMapping("/employee")
  public ResponseEntity<Object> createEmployee(@RequestBody Employee employee) {
    Employee savedEmployee = employeeRepository.save(employee);

    URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}")
      .buildAndExpand(savedEmployee.getId()).toUri();

    return ResponseEntity.created(location).build();

  }

  @PutMapping("/employee/{id}")
  public ResponseEntity<Object> updateStudent(@RequestBody Employee employee, @PathVariable long id) {

    Optional<Employee> studentOptional = employeeRepository.findById(id);

    if (!studentOptional.isPresent())
      return ResponseEntity.notFound().build();

    employee.setId(id);

    employeeRepository.save(employee);

    return ResponseEntity.noContent().build();
  }
}