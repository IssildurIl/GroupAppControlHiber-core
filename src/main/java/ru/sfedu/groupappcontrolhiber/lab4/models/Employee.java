package ru.sfedu.groupappcontrolhiber.lab4.models;



import lombok.Data;
import ru.sfedu.groupappcontrolhiber.enums.TypeOfEmployee;

import javax.persistence.*;
import java.io.Serializable;


@Data
@Table(name = "Employee4")
public class Employee implements Serializable {
  @Id
  @Column(name = "ID")
  @GeneratedValue(strategy = GenerationType.AUTO)
  private long id;
  @Column (name = "FirstName")
  private String firstName;
  @Column (name = "LastName")
  private String lastName;
  @Column (name = "Login")
  private String login;
  @Column (name = "Password")
  private String password;
  @Column (name = "Email")
  private String email;
  @Column (name = "Token")
  private String token;
  @Column (name = "Department")
  private String department;
  @Column (name = "TypeOfEmployee")
  private TypeOfEmployee typeOfEmployee;

  public Employee() { }


}
