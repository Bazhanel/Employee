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
@Table(name = "employee")
@Data
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
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

  @Column(name = "departmentid")
  private Long departmentId;

  @Column(name = "jobbegindate")
  private Date jobBeginDate;

  @Column(name = "dismissdate")
  private Date dismissDate;

  @Column(name = "postid")
  public Long postId;

  @Column(name = "email")
  public  String email;

  @Column(name = "internalnumber")
  public String internalNumber;

  @Column(name = "phone1")
  public  String phone1;

  @Column(name = "phone2")
  public  String phone2;

  @Column(name = "categoryid")
  public  Long categoryId;

  @Column(name = "photo")
  public String photo;

  @Column(name = "cardid")
  public String cardId;

  @Column(name = "dbuser")
  public String dbUser;

  @Column(name = "discountid")
  public Long discountId;

  @Column(name = "gender")
  private int gender;

  public Employee() {

  }

  public Employee(String firstName, String lastName, String familyName) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.familyName = familyName;
  }

}
