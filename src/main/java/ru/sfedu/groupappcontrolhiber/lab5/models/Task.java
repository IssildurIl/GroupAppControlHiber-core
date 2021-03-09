package ru.sfedu.groupappcontrolhiber.lab5.models;


import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.RequiredArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

@Data
@EqualsAndHashCode
@Entity
@RequiredArgsConstructor
@Table(schema = "S6")
public class Task implements Serializable {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  long id;

  String name;
  //двунаправленная
  @OneToMany(mappedBy = "task",fetch = FetchType.LAZY)
  @ToString.Exclude
  Set<Employee> team = new HashSet<>();

}
