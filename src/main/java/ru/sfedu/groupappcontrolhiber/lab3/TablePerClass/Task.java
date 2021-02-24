package ru.sfedu.groupappcontrolhiber.lab3.TablePerClass;

import lombok.Data;
import ru.sfedu.groupappcontrolhiber.enums.TaskTypes;
import ru.sfedu.groupappcontrolhiber.enums.TypeOfCompletion;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.List;

@Data
@Entity(name="Task1")
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
@Table(schema = "S2")
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
