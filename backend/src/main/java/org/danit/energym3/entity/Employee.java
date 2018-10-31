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
@Table(name = "employee")
@Data
public class Employee {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @Column(name = "firstname")
  private String firstName;

  @Column(name = "lastname")
  private String lastName;

  @Column(name = "familyname")
  private String familyName;

  @Column(name = "birthdate")
  private Date birthDate;

  @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
  @JoinColumn(name = "departmentid")
  private Department department;

  @Column(name = "jobbegindate")
  private Date jobBeginDate;

  @Column(name = "dismissdate")
  private Date dismissDate;

  @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
  @JoinColumn(name = "postid")
  private Post post;

  @Column(name = "email")
  private String email;

  @Column(name = "internalnumber")
  private String internalNumber;

  @Column(name = "phone1")
  private String phone1;

  @Column(name = "phone2")
  private String phone2;

  @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
  @JoinColumn(name = "categoryid")
  private Category category;

  @Column(name = "photo")
  private String photo;

  @Column(name = "cardid")
  private String cardId;

  @Column(name = "dbuser")
  private String dbUser;

  @Column(name = "discountid")
  private Long discountId;

  @Column(name = "gender")
  private int gender;

  @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
  @JoinColumn(name = "employeeid", referencedColumnName = "id")
  private List<EmployeeDiscount> employeeDiscountList;

}
