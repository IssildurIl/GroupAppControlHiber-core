package ru.sfedu.groupappcontrolhiber.lab3.api;

import lombok.Data;
import lombok.EqualsAndHashCode;
import ru.sfedu.groupappcontrolhiber.lab3.enums.TypeOfTester;

import javax.persistence.Column;
import javax.persistence.Table;
import java.io.Serializable;

/**
 * Class Tester
 */
@EqualsAndHashCode(callSuper = true)
@Data
@Table(name = "Tester")
public class Tester extends Developer implements Serializable {
  @Column(name = "TypeOfTester")
  private TypeOfTester typeOfTester;
  public Tester () { };


}
