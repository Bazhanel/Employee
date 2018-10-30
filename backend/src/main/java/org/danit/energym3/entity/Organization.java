package org.danit.energym3.entity;


import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Entity
@Table(name = "organization")
public class Organization {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
  private String sname;
  private String name;
  private String phone;
  private String phone2;
  private String email;
  private String address;
  private String orgcode;
}
