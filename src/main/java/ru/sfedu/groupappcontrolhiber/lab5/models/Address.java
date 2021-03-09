package ru.sfedu.groupappcontrolhiber.lab5.models;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.*;
import javax.transaction.Transactional;
import java.io.Serializable;

@Data
@EqualsAndHashCode
@Entity
@Table(schema = "S6")
@Transactional
public class Address implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String street;
    private String city;
}
