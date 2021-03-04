package ru.sfedu.groupappcontrolhiber.lab5.models;


import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import ru.sfedu.groupappcontrolhiber.Constants;
import ru.sfedu.groupappcontrolhiber.enums.ProgrammingLanguage;
import ru.sfedu.groupappcontrolhiber.enums.TypeOfDevelopers;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;

/**
 * Class Developer
 */
@Data

@Entity
@Table(schema = "S6")
public class Developer implements Serializable {
  @Id
  //@GeneratedValue(strategy = GenerationType.AUTO)
  private long id;

  //Разделяемый первичный
  @OneToOne(fetch = FetchType.EAGER, optional = false)
  @PrimaryKeyJoinColumn
  Inventory inventory;

  public Developer () { }
}
