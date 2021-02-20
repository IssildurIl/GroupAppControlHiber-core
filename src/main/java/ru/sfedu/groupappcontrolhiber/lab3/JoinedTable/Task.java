package ru.sfedu.groupappcontrolhiber.lab3.JoinedTable;

import lombok.Data;
import ru.sfedu.groupappcontrolhiber.enums.TaskTypes;
import ru.sfedu.groupappcontrolhiber.enums.TypeOfCompletion;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.List;

@Data
@Entity(name = "Task2")
@Inheritance(strategy = InheritanceType.JOINED)
@Table(schema = "S3")
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
  @ManyToMany
  @JoinColumn(name = "ID")
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
