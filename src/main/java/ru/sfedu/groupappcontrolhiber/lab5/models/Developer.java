package ru.sfedu.groupappcontrolhiber.lab5.models;


import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.*;
import javax.transaction.Transactional;
import java.io.Serializable;
import java.util.Set;

/**
 * Class Developer
 */
@Data
@EqualsAndHashCode
@Entity
@Table(schema = "S6",name = "DeveloperLab5")
public class Developer implements Serializable {
  @Id
  private long id;

  private String name;
  //Разделяемый первичный
  @OneToOne(fetch = FetchType.LAZY, optional = false)
  @PrimaryKeyJoinColumn
  Inventory inventory;

  public Developer () { }
}
