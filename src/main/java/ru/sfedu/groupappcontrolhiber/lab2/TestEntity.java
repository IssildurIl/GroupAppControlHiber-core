package ru.sfedu.groupappcontrolhiber.lab2;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Data
@Entity
@Table(name = "TESTENTITY", schema = "S2")
public class TestEntity implements Serializable {
    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    @Column(name = "NAME",nullable = false)
    String name;
    @Column(name = "DESCRIPTION",nullable = false)
    String description;
    @Column(name = "DATECREATED")
    @Temporal(TemporalType.DATE)
    Date dateCreated;
    @Column(name = "CHECK_")
    Boolean check;

    @Embedded
    @AttributeOverrides({
           @AttributeOverride(name = "city",
                    column=@Column(name = "Home_CITY")),
           @AttributeOverride(name = "street",
                    column=@Column(name = "Home_Street"))
    })
    private Address homeAddress;

    @Embedded
    @AttributeOverrides({
            @AttributeOverride(name = "city",
                    column=@Column(name = "Work_CITY")),
            @AttributeOverride(name = "street",
                    column=@Column(name = "Work_Street"))
    })
    private Address workAddress;


}
