package ru.sfedu.groupappcontrolhiber.lab3.JoinedTable;

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

@EqualsAndHashCode(callSuper = true)
@Data
@ToString(callSuper = true)
@Entity(name = "DeveloperJTLab3")
@Table(schema = "S3",name = "DeveloperJTLab3")
public class Developer extends Employee implements Serializable {
  private TypeOfDevelopers status;
  private ProgrammingLanguage programmingLanguage;

  public Developer () { }
}
