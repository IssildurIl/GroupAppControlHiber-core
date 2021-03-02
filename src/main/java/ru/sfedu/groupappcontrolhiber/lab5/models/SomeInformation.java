package ru.sfedu.groupappcontrolhiber.lab5.models;

import lombok.Data;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.io.Serializable;

@Data
@Entity
@Table(schema = "S6")
public class SomeInformation implements Serializable {
    @Id
    @GeneratedValue(generator = "addressGen")
    @GenericGenerator(
            name = "addressGen",
            strategy = "foreign",
            parameters = @org.hibernate.annotations.Parameter(
                    name = "property" , value = "testersTask"
            )
    )
    private long id;

    //@OneToOne(mappedBy = "infos")
    @OneToOne(optional = false)
    @PrimaryKeyJoinColumn
    TestersTask testersTask;


    private String someInfos;
}
