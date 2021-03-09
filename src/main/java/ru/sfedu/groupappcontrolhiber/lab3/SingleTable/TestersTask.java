package ru.sfedu.groupappcontrolhiber.lab3.SingleTable;



import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import ru.sfedu.groupappcontrolhiber.enums.BugStatus;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.io.Serializable;


/**
 * Class TestersTask
 */
@EqualsAndHashCode(callSuper = true)
@Data
@ToString(callSuper = true)
@Entity(name = "TestersTaskSTLab3")
@Table(schema = "S4",name = "TestersTaskSTLab3")
public class TestersTask extends Task implements Serializable {
  private BugStatus bugStatus;
  private String bugDescription;

  public TestersTask () { };

  }
