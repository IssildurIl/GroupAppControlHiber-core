package ru.sfedu.groupappcontrolhiber.lab3.SingleTable;

import lombok.Data;
import ru.sfedu.groupappcontrolhiber.enums.TaskTypes;
import ru.sfedu.groupappcontrolhiber.enums.TypeOfCompletion;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.List;

@Data
@Entity(name = "TaskSTLab3")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@Table(schema = "S4",name = "TaskSTLab3")
public class Task implements Serializable {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private long id;
  @Column(name="TaskDescription")
  private String taskDescription;
  @Column(name = "Money")
  private double money;
  @OneToOne
  private Employee scrumMaster;
  @Column(name = "Status")
  private TypeOfCompletion status;
  @ManyToMany(fetch=FetchType.EAGER)
  @JoinColumn
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
