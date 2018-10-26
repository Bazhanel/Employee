package org.danit.energym3.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Column;
import java.util.Date;

@Entity
@Data
@Table(name = "department")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
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

  private Department() {

  }

  public Department(Long pid, String sname, String name, Date dateFrom, Date dateTo, int hierLevel) {
    this.pid = pid;
    this.sname = sname;
    this.name = name;
    this.dateFrom = dateFrom;
    this.dateTo = dateTo;
    this.hierLevel = hierLevel;
  }
}
