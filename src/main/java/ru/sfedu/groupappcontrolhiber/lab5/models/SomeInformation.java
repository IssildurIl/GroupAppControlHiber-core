package ru.sfedu.groupappcontrolhiber.lab5.models;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import javax.transaction.Transactional;
import java.io.Serializable;

@Data
@Entity
@EqualsAndHashCode
@Table(schema = "S6")
@Transactional
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
    @OneToOne(optional = false,fetch = FetchType.LAZY)
    @PrimaryKeyJoinColumn
    TestersTask testersTask = new TestersTask();


    private String someInfos;
}
