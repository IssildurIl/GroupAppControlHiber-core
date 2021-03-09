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
@Transactional
public class Employee implements Serializable {
  @Id
  @Column(name = "employee_id")
  @GeneratedValue(strategy = GenerationType.AUTO)
  private long id;

  //двунаправленная
  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "task_id",nullable = false)
  Task task = new Task();

  //Внешний ключ
  @OneToOne(
          fetch = FetchType.EAGER,
          optional = false,
          cascade = CascadeType.ALL
  )
  @JoinColumn(unique = true)
  Address address = new Address();

  private String firstName;

  public Employee () { }
}
