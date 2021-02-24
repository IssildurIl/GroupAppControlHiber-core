package ru.sfedu.groupappcontrolhiber.lab3.TablePerClass;


import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import ru.sfedu.groupappcontrolhiber.enums.DeveloperTaskType;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.io.Serializable;


/**
 * Class DevelopersTask
 */
@EqualsAndHashCode(callSuper = true)
@Data
@ToString(callSuper = true)
@Entity(name = "DeveloperTask1")
@Table(schema = "S2")
public class DevelopersTask extends Task implements Serializable {

  private String developerComments;
  private DeveloperTaskType developerTaskType;

  public DevelopersTask () { };

}
