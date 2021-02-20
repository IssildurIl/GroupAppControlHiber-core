package ru.sfedu.groupappcontrolhiber.lab3.SingleTable;



import lombok.Data;
import lombok.EqualsAndHashCode;
import ru.sfedu.groupappcontrolhiber.enums.BugStatus;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.io.Serializable;


/**
 * Class TestersTask
 */
@EqualsAndHashCode(callSuper = true)
@Data
@Entity(name = "TestersTask3")
@Table(schema = "S4")
public class TestersTask extends Task implements Serializable {
  private BugStatus bugStatus;
  private String bugDescription;

  public TestersTask () { };

  }
