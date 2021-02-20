package ru.sfedu.groupappcontrolhiber.lab3.SingleTable;

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
@Table(schema = "S3")
@Entity(name = "Tester4")
public class Tester extends Developer implements Serializable {
  @Column(name = "TypeOfTester")
  private TypeOfTester typeOfTester;
  public Tester () { };


}
