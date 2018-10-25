package org.danit.energym3.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Employee {
  @Id
  @GeneratedValue
  private  Long id;
  private String firstName;
  private String lastName;
  private String fanilyName;

  protected Employee() {

  }

  public Employee(String firstName, String lastName, String fanilyName) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.fanilyName = fanilyName;
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

  public String getFanilyName() {
    return fanilyName;
  }

  public void setFamilyName(String familyName) {
    this.fanilyName = fanilyName;
  }
}
