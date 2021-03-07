package ru.sfedu.groupappcontrolhiber.lab4.models;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Data
public class Inventory implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @Column (name = "name",nullable = true)
    private String name;
    @Column (name = "mark",nullable = true)
    private String mark;

}
