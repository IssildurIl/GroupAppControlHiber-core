package ru.sfedu.groupappcontrolhiber.lab3;

import lombok.extern.log4j.Log4j2;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import ru.sfedu.groupappcontrolhiber.Constants;
import ru.sfedu.groupappcontrolhiber.lab3.MappedSuperclass.Developer;
import ru.sfedu.groupappcontrolhiber.lab3.MappedSuperclass.Tester;
import ru.sfedu.groupappcontrolhiber.lab3.api.MappedSuperclassDataProvider;
import ru.sfedu.groupappcontrolhiber.utils.Generator.MappedSuperclassGenerator;

@Log4j2
class MappedSuperclassDataProviderTest {

    public static final MappedSuperclassDataProvider instance = new MappedSuperclassDataProvider();
    public static final MappedSuperclassGenerator inst = new MappedSuperclassGenerator();
    @BeforeAll
    static void setEnv() {
        MappedSuperclassGenerator map = new MappedSuperclassGenerator();
        map.mappedSuperclassGen();
    }

    @Test
    void delete() {
        Developer developer = instance.getById(Developer.class,2L).getData();
        instance.delete(developer);
        Assertions.assertNull(instance.getById(Developer.class, 2L).getData());
    }

    @Test
    void save() {
    }

    @Test
    void getById() {
        Developer developer = instance.getById(Developer.class,1L).getData();
        Tester tester= instance.getById(Tester.class,11L).getData();
        log.info(Constants.MappedTable + developer.toString());
        log.info(Constants.MappedTable + tester.toString());
        Assertions.assertEquals(11L,tester.getId());
    }

}