package ru.sfedu.groupappcontrolhiber.lab3.api;

import lombok.Data;
import lombok.EqualsAndHashCode;
import ru.sfedu.groupappcontrolhiber.lab3.enums.ProgrammingLanguage;
import ru.sfedu.groupappcontrolhiber.lab3.enums.TypeOfDevelopers;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.io.Serializable;

/**
 * Class Developer
 */

@EqualsAndHashCode(callSuper = true)
@Data
@Entity
@Table(name = "DEVELOPER")
public class Developer extends Employee implements Serializable {
  private TypeOfDevelopers status;
  private ProgrammingLanguage programmingLanguage;

  public Developer () { }

}
