package org.danit.energym3.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import javax.persistence.*;
import java.util.Date;

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

  @OneToOne
  @JsonIgnore
  @JoinColumn(name = "departmentid", referencedColumnName = "id")
  private Department department;

  @Column(name = "jobbegindate")
  private Date jobBeginDate;

  @Column(name = "dismissdate")
  private Date dismissDate;

  @Column(name = "postid")
  private Long postId;

  @Column(name = "email")
  private  String email;

  @Column(name = "internalnumber")
  private String internalNumber;

  @Column(name = "phone1")
  private  String phone1;

  @Column(name = "phone2")
  private  String phone2;

  @Column(name = "categoryid")
  private  Long categoryId;

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

  public Employee() {

  }

  public Employee(String firstName, String lastName, String familyName, Long departmentId) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.familyName = familyName;
    //this.departmentId = departmentId;
  }

}
