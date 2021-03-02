package ru.sfedu.groupappcontrolhiber.lab5.models;


import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import ru.sfedu.groupappcontrolhiber.enums.DeveloperTaskType;
import ru.sfedu.groupappcontrolhiber.lab5.models.Task;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;


/**
 * Class DevelopersTask
 */
@EqualsAndHashCode(callSuper = true)
@Data
@ToString(callSuper = true)
@Entity
@Table(schema = "S6")
public class DevelopersTask extends Task implements Serializable {

  private String developerComments;
  private DeveloperTaskType developerTaskType;


  //Многие ко многим
  @ManyToMany(fetch = FetchType.EAGER)
  @JoinTable(
          name = "developer_developerstask",
          joinColumns = @JoinColumn(name = "developerstask_id"),
          inverseJoinColumns = @JoinColumn(name = "developer")
  )
  private List<Developer> developer = new ArrayList<>();

  public DevelopersTask() { }

}
