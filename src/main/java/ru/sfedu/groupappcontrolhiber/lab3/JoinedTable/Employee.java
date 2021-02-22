package ru.sfedu.groupappcontrolhiber.lab3.JoinedTable;



import lombok.Data;
import ru.sfedu.groupappcontrolhiber.enums.TypeOfEmployee;

import javax.persistence.*;
import java.io.Serializable;

@Data
@Entity(name = "Employee2")
@Inheritance(strategy = InheritanceType.JOINED)
@Table(schema = "S3")
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

  public Employee () { }
  public Employee setEmployee (Employee employee, String firstname, String lastname, String login, String password, String email,
                   String token, String department, TypeOfEmployee typeOfEmployee) {
    employee.setFirstName(firstname);
    employee.setLastName(lastname);
    employee.setLogin(login);
    employee.setPassword(password);
    employee.setEmail(email);
    employee.setToken(token);
    employee.setDepartment(department);
    employee.setTypeOfEmployee(typeOfEmployee);
    return employee;
  }

}
