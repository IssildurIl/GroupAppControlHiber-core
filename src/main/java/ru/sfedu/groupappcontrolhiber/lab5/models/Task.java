package ru.sfedu.groupappcontrolhiber.lab5.models;


import lombok.Data;
import ru.sfedu.groupappcontrolhiber.lab5.models.Employee;

import javax.persistence.*;
import java.io.Serializable;
import java.util.*;

@Data
@Entity
@Table(schema = "S6")
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
