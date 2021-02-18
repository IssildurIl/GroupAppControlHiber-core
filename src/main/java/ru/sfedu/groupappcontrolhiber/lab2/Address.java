package ru.sfedu.groupappcontrolhiber.lab2;

import lombok.Data;

import javax.persistence.Embeddable;
import javax.persistence.Column;
import java.io.Serializable;

@Data
@Embeddable
public class Address implements Serializable {
    private String street;
    private String city;
}
