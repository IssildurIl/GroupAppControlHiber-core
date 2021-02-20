package ru.sfedu.groupappcontrolhiber.lab3.MappedSuperclass;

import lombok.Data;
import lombok.EqualsAndHashCode;
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
@Entity(name = "Tester")
@Table
public class Tester extends Developer implements Serializable {
  @Column(name = "TypeOfTester")
  private TypeOfTester typeOfTester;
  public Tester () { };


}
