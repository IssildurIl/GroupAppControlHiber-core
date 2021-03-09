package ru.sfedu.groupappcontrolhiber.lab3.MappedSuperclass;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import ru.sfedu.groupappcontrolhiber.enums.TypeOfTester;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.io.Serializable;

/**
 * Class Tester
 */
@EqualsAndHashCode(callSuper = true)
@Data
@ToString(callSuper = true)
@Entity(name = "TesterMSLab3")
@Table(schema = "S5",name = "TesterMSLab3")
public class Tester extends Developer implements Serializable {
  @Column(name = "TypeOfTester")
  private TypeOfTester typeOfTester;
  public Tester () { }


}
