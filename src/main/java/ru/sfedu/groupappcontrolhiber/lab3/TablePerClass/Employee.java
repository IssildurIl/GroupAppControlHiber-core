package ru.sfedu.groupappcontrolhiber.lab3.TablePerClass;



import lombok.Data;
import ru.sfedu.groupappcontrolhiber.enums.TypeOfEmployee;

import javax.persistence.*;
import java.io.Serializable;

@Data
@Entity(name = "EmployeeTPSLab3")
@Table(schema = "S2",name = "EmployeeTPSLab3")
public class Employee implements Serializable {
  @Id
  @Column(name = "ID")
  @GeneratedValue(strategy = GenerationType.IDENTITY)
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

  public Employee () { }


}
