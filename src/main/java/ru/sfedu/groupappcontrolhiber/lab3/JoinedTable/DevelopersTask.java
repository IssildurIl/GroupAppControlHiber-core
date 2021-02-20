package ru.sfedu.groupappcontrolhiber.lab3.JoinedTable;


import lombok.Data;
import lombok.EqualsAndHashCode;
import ru.sfedu.groupappcontrolhiber.enums.DeveloperTaskType;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.io.Serializable;


/**
 * Class DevelopersTask
 */
@EqualsAndHashCode(callSuper = true)
@Data
@Entity(name = "DeveloperTask2")
@Table(schema = "S3")
public class DevelopersTask extends Task implements Serializable {

  private String developerComments;
  private DeveloperTaskType developerTaskType;

  public DevelopersTask () { };

}
