package ru.sfedu.groupappcontrolhiber.lab3.MappedSuperclass;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import ru.sfedu.groupappcontrolhiber.enums.ProgrammingLanguage;
import ru.sfedu.groupappcontrolhiber.enums.TypeOfDevelopers;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.io.Serializable;

/**
 * Class Developer
 */
@Entity
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
@Data
@Table(schema = "S5")
public class Developer extends Employee implements Serializable {
  private TypeOfDevelopers status;
  private ProgrammingLanguage programmingLanguage;

  public Developer () { }



}
