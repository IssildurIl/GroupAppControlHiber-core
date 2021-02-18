package ru.sfedu.groupappcontrolhiber.lab3.api;

import lombok.Data;
import ru.sfedu.groupappcontrolhiber.lab3.enums.TaskTypes;
import ru.sfedu.groupappcontrolhiber.lab3.enums.TypeOfCompletion;
import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.List;


@Data
@Entity
@Table(name = "Task")
public class Task implements Serializable {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private long id;
  @Column(name="TaskDescription")
  private String taskDescription;
  @Column(name = "Money")
  private double money;
  @Embedded
  @Column(name = "scrumMaster")
  private Employee scrumMaster;
  @Column(name = "Status")
  private TypeOfCompletion status;
  @Embedded
  @Column (name = "TEAM")
  private List<Employee> team;
  @Column (name = "CreatedDate")
  @Temporal(TemporalType.DATE)
  private Date createdDate;
  @Temporal(TemporalType.DATE)
  @Column (name = "deadline")
  private Date deadline;
  @Column (name = "lastUpdate")
  @Temporal(TemporalType.DATE)
  private Date lastUpdate;
  @Column (name="TaskType")
  private TaskTypes taskType;

  public Task () { }

}
