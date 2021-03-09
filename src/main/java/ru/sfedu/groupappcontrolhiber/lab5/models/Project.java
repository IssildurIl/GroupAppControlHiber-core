package ru.sfedu.groupappcontrolhiber.lab5.models;


import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.RequiredArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import javax.transaction.Transactional;
import java.io.Serializable;

@Data
@Entity
@EqualsAndHashCode
@RequiredArgsConstructor
@Table(schema = "S6")
public class Project implements Serializable {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private long id;

  private String title;

  //Однонаправленная ассоциация
  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "task_id",nullable = false)
  @ToString.Exclude
  private Task task;


}
