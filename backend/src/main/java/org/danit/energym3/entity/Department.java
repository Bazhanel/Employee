package org.danit.energym3.entity;

import lombok.Data;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.Date;
import java.util.List;

@Entity
@Data
@Table(name = "department")
public class Department {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @OneToMany
  @JoinColumn(name = "pid")
  private List<Department> child;

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

  @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
  @JoinColumn(name = "organizationid")
  private Organization organization;

  @Column(name = "position")
  private String position;

}

