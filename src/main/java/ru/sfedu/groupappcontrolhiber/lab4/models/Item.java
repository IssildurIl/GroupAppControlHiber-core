package ru.sfedu.groupappcontrolhiber.lab4.models;

import lombok.Data;
import javax.persistence.*;
import java.io.Serializable;
import java.util.*;


@Data
@Entity
@Table
public class Item implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    //Set
    @ElementCollection(fetch = FetchType.EAGER)
    @CollectionTable(name = "programmingLanguage")
    private Set<String> programmingLanguage = new HashSet<String>();
    //List

    @OrderColumn
    @ElementCollection(fetch = FetchType.EAGER)
    //@CollectionTable(name = "Employee4")
    private List<String> team;
    //Map
    @ElementCollection(fetch = FetchType.EAGER)
    @CollectionTable(name = "certificateMap")
    @MapKeyColumn(name = "data")
    private Map<String,String> map = new HashMap<String, String>();
    //CustomMap
    @ElementCollection(fetch = FetchType.EAGER)
    @CollectionTable(name = "INVENTORY")
    @MapKeyColumn(name = "worker")
    private Map<String,Inventory> custommap = new HashMap<String, Inventory>();
    //Embedded
    @Embedded
    @AttributeOverrides({
            @AttributeOverride(name = "city",
                    column=@Column(name = "Work_CITY")),
            @AttributeOverride(name = "street",
                    column=@Column(name = "Work_Street"))
    })
    private Address address;

}
