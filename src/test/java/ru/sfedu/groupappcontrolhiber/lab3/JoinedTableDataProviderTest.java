package ru.sfedu.groupappcontrolhiber.lab3;

import lombok.extern.log4j.Log4j2;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import ru.sfedu.groupappcontrolhiber.Constants;
import ru.sfedu.groupappcontrolhiber.lab3.JoinedTable.Employee;
import ru.sfedu.groupappcontrolhiber.lab3.JoinedTable.Developer;
import ru.sfedu.groupappcontrolhiber.lab3.api.JoinedTableDataProvider;
import ru.sfedu.groupappcontrolhiber.utils.Generator.JoinTableGenerator;
@Log4j2
class JoinedTableDataProviderTest {
    public static final JoinedTableDataProvider instance = new JoinedTableDataProvider();
    public static final JoinTableGenerator inst = new JoinTableGenerator();
    @BeforeAll
    static void setEnv() {
        inst.joinTableGen();
    }

    @Test
    void delete() {
        Employee employee = instance.getById(Employee.class,2L).getData();
        instance.delete(employee);
        Assertions.assertNull(instance.getById(Employee.class, 2L).getData());
    }

    @Test
    void update() {
        Employee employee = instance.getById(Employee.class,3L).getData();
        employee.setFirstName("I AM TEST EMPLOYEE");
        instance.update(employee);
        Assertions.assertEquals("I AM TEST EMPLOYEE",instance.getById(Employee.class,3L).getData().getFirstName());
    }

    @Test
    void getById() {
        Employee employee = instance.getById(Employee.class,1L).getData();
        log.info(Constants.JoinTable + employee.toString());
        Developer developer = instance.getById(Developer.class,11L).getData();
        log.info(Constants.JoinTable + developer.toString());
        Assertions.assertEquals(11L,developer.getId());
    }
}