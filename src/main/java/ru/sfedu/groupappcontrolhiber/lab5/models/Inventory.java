package ru.sfedu.groupappcontrolhiber.lab5.models;

import lombok.Data;
import ru.sfedu.groupappcontrolhiber.Constants;

import javax.persistence.*;
import java.io.Serializable;

@Data
@Entity
public class Inventory implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    //@GeneratedValue(generator = Constants.ID_GEN)
    private long id;
    private String name;
    private String mark;

}
