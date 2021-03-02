package ru.sfedu.groupappcontrolhiber.lab5.models;



import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import ru.sfedu.groupappcontrolhiber.enums.BugStatus;

import javax.persistence.*;
import java.io.Serializable;


/**
 * Class TestersTask
 */

@Data
@Entity
@Table(schema = "S6")
public class TestersTask implements Serializable {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private long id;
  private BugStatus bugStatus;
  private String bugDescription;

  //Генерируемый внешний
  @OneToOne
          (mappedBy = "testersTask",
          cascade = CascadeType.PERSIST)
  //@JoinColumn(name="someinformation_id")
  SomeInformation infos;

  public TestersTask() { };

  }
