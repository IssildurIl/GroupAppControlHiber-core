package ru.sfedu.groupappcontrolhiber.lab5.api;

import lombok.extern.log4j.Log4j2;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import ru.sfedu.groupappcontrolhiber.enums.ProgrammingLanguage;
import ru.sfedu.groupappcontrolhiber.enums.TypeOfDevelopers;
import ru.sfedu.groupappcontrolhiber.lab5.api.Lab5HQL;
import ru.sfedu.groupappcontrolhiber.lab5.models.*;

import javax.persistence.criteria.CriteriaBuilder;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;
@Log4j2
class Lab5HQLTest {
    public static final Lab5HQL instance = new Lab5HQL();

    @BeforeAll
    static void setEnv() {

    }

    @Test
    public void start(){
        Address address = new Address();
        address.setCity("City");
        address.setStreet("Street");
        instance.save(address);

        Task task = new Task();
        task.setName("test task");
        instance.save(task);

        Employee employee = new Employee();
        employee.setFirstName("Van");
        employee.setAddress(address);
        employee.setTask(task);
        instance.save(employee);

        Project project = new Project();
        project.setTitle("Project 1");
        project.setTask(task);
        instance.save(project);


        Inventory inventory =new Inventory();
        inventory.setName("PC");
        inventory.setMark("Intel");
        instance.save(inventory);

        Developer developer = new Developer();
        developer.setInventory(inventory);
        log.info(developer.toString());
        instance.save(developer);

        List<Developer> developers = new ArrayList<>();
        developers.add(developer);

        DevelopersTask dt = new DevelopersTask();
        dt.setDeveloper(developers);
        dt.setDeveloperComments("Test DevTask");
        instance.save(dt);

        TestersTask tt = new TestersTask();
        tt.setBugDescription("description");
        instance.save(tt);


        SomeInformation someInformation = new SomeInformation();
        someInformation.setSomeInfos("INFO FOR TEST");
        someInformation.setTestersTask(tt);
        log.info(someInformation.toString());
        instance.save(someInformation);


    }
}