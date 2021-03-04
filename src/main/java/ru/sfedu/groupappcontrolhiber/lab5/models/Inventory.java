package ru.sfedu.groupappcontrolhiber.lab5.models;

import lombok.Data;
import ru.sfedu.groupappcontrolhiber.Constants;

import javax.persistence.*;
import java.io.Serializable;

@Data
@Entity
@Table(schema = "S6")
public class Inventory implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    //@GeneratedValue(generator = Constants.ID_GEN)
    private long id;
    private String name;
    private String mark;

}
