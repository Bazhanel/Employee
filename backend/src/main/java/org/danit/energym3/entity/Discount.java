package org.danit.energym3.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Entity
@Table(name = "doscount")
public class Discount {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "id")
  public String name;
  @Column(name = "name")
  public String percent;
  @Column(name = "percent ")
  public String dateFrom;
  @Column(name = "datefrom ")
  public String dateTo;

  public Discount(String name) {

  }
}
