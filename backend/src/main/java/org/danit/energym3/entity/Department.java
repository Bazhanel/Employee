package org.danit.energym3.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Data
@Table(name = "department")
public class Department {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @Column(name = "pid", nullable = false)
  private Long pid;

  @Column(name = "sname", nullable = false)
  private String sname;

  @Column(name = "name", nullable = false)
  private String name;

  @Column(name = "datefrom", nullable = false)
  private Date dateFrom;

  @Column(name = "dateto")
  private Date dateTo;

  @Column(name = "hier_level", nullable = false)
  private int hierLevel;

  @Column(name = "orgsign")
  private int orgSign;

}

