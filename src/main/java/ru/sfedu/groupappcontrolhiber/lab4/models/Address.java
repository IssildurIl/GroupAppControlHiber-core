package ru.sfedu.groupappcontrolhiber.lab4.models;

import lombok.Data;

import javax.persistence.Embeddable;
import java.io.Serializable;

@Data
@Embeddable
public class Address implements Serializable {
    private String street;
    private String city;
}
