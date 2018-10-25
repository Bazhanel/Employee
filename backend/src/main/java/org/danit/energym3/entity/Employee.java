package org.danit.energym3.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "employee")
@Data
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Employee {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private  Long id;
  private String firstName;
  private String lastName;
  private String familyName;

  public Employee(){

  }

  public Employee(String firstName, String lastName, String familyName) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.familyName = familyName;
  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public String getFamilyName() {
    return familyName;
  }

  public void setFamilyName(String familyName) {
    this.familyName = familyName;
  }
}
