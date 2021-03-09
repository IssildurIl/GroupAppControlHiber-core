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
@Entity(name = "DeveloperMSLab3")
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
@Data
@Table(schema = "S5",name = "DeveloperMSLab3")
public class Developer extends Employee implements Serializable {
  private TypeOfDevelopers status;
  private ProgrammingLanguage programmingLanguage;

  public Developer () { }



}
