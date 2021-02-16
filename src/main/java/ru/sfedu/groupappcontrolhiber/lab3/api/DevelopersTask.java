package ru.sfedu.groupappcontrolhiber.lab3.api;


import lombok.Data;
import lombok.EqualsAndHashCode;
import ru.sfedu.groupappcontrolhiber.lab3.enums.DeveloperTaskType;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.io.Serializable;


/**
 * Class DevelopersTask
 */
@EqualsAndHashCode(callSuper = true)
@Data
@Entity
@Table(name = "DevelopersTask")
public class DevelopersTask extends Task implements Serializable {

  private String developerComments;
  private DeveloperTaskType developerTaskType;

  public DevelopersTask () { };

}
