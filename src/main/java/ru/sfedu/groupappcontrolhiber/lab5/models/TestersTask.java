package ru.sfedu.groupappcontrolhiber.lab5.models;



import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import ru.sfedu.groupappcontrolhiber.enums.BugStatus;

import javax.persistence.*;
import javax.transaction.Transactional;
import java.io.Serializable;


/**
 * Class TestersTask
 */

@Data
@Entity
@EqualsAndHashCode
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
  @ToString.Exclude
  SomeInformation infos;

  public TestersTask() { };

  }
