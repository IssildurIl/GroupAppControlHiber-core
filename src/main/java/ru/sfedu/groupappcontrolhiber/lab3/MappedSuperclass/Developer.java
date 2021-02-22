package ru.sfedu.groupappcontrolhiber.lab3.MappedSuperclass;

import lombok.Data;
import lombok.EqualsAndHashCode;
import ru.sfedu.groupappcontrolhiber.enums.ProgrammingLanguage;
import ru.sfedu.groupappcontrolhiber.enums.TypeOfDevelopers;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.io.Serializable;

/**
 * Class Developer
 */
@Entity
@EqualsAndHashCode(callSuper = true)
@Data
@Table
public class Developer extends Employee implements Serializable {
  private TypeOfDevelopers status;
  private ProgrammingLanguage programmingLanguage;

  public Developer () { }



}
