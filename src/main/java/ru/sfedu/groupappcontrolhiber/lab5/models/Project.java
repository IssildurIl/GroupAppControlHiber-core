package ru.sfedu.groupappcontrolhiber.lab5.models;


import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.*;
import javax.transaction.Transactional;
import java.io.Serializable;

@Data
@Entity
@EqualsAndHashCode
@Table(schema = "S6")
public class Project implements Serializable {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private long id;

  private String title;

  //Однонаправленная ассоциация
  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "task_id",nullable = false)
  private Task task;


  public Project() { }
}
