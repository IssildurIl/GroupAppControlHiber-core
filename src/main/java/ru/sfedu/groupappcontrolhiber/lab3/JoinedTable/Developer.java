package ru.sfedu.groupappcontrolhiber.lab3.JoinedTable;

import lombok.Data;
import lombok.EqualsAndHashCode;
import ru.sfedu.groupappcontrolhiber.enums.ProgrammingLanguage;
import ru.sfedu.groupappcontrolhiber.enums.TypeOfDevelopers;
import ru.sfedu.groupappcontrolhiber.enums.TypeOfEmployee;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.io.Serializable;

/**
 * Class Developer
 */

@EqualsAndHashCode(callSuper = true)
@Data
@Entity(name = "Developer2")
@Table(schema = "S3")
public class Developer extends Employee implements Serializable {
  private TypeOfDevelopers status;
  private ProgrammingLanguage programmingLanguage;

  public Developer () { }
  public Developer(ru.sfedu.groupappcontrolhiber.lab3.MappedSuperclass.Developer developer, String firstname, String lastname, String login, String password, String email,
                   String token, String department, TypeOfEmployee typeOfEmployee, TypeOfDevelopers status,
                   ProgrammingLanguage programmingLanguage) {
    developer.setFirstName(firstname);
    developer.setLastName(lastname);
    developer.setLogin(login);
    developer.setPassword(password);
    developer.setEmail(email);
    developer.setToken(token);
    developer.setDepartment(department);
    developer.setTypeOfEmployee(typeOfEmployee);
    developer.setStatus(status);
    developer.setProgrammingLanguage(programmingLanguage);
  }
}
