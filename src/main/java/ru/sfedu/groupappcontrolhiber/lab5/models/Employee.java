package ru.sfedu.groupappcontrolhiber.lab5.models;


import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Data
@Entity
@Table(schema = "S6")
public class Employee implements Serializable {
  @Id
  @Column(name = "employee_id")
  @GeneratedValue(strategy = GenerationType.AUTO)
  private long id;

  //двунаправленная
  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "task_id",nullable = false)
  Task task;

  //Внешний ключ
  @OneToOne(
          fetch = FetchType.LAZY,
          optional = false,
          cascade = CascadeType.ALL
  )
  @JoinColumn(unique = true)
  Address address;

  private String firstName;

  public Employee () { }
}
