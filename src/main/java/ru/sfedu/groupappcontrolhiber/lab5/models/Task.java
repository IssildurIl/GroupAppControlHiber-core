package ru.sfedu.groupappcontrolhiber.lab5.models;


import lombok.Data;
import lombok.EqualsAndHashCode;
import ru.sfedu.groupappcontrolhiber.lab5.models.Employee;

import javax.persistence.*;
import javax.transaction.Transactional;
import java.io.Serializable;
import java.util.*;

@Data
@EqualsAndHashCode
@Entity
@Table(schema = "S6")
@Transactional
public class Task implements Serializable {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  long id;

  String name;
  //двунаправленная
  @OneToMany(mappedBy = "task",fetch = FetchType.LAZY)
  Set<Employee> team = new HashSet<>();



  public Task () { }
}
