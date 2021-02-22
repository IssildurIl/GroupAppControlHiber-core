package ru.sfedu.groupappcontrolhiber.lab3.api;

import lombok.extern.log4j.Log4j2;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import ru.sfedu.groupappcontrolhiber.utils.Generator.MappedSuperclassGenerator;

@Log4j2
class MappedSuperclassDataProviderTest {

    public static MappedSuperclassDataProvider instance = new MappedSuperclassDataProvider();
    public static MappedSuperclassGenerator inst = new MappedSuperclassGenerator();
    @BeforeAll
    static void setEnv() {
         inst.mappedSuperclassGen();
    }

    @Test
    void delete() {

    }

    @Test
    void save() {
    }

    @Test
    void getById() {

    }

    @Test
    void testDelete() {
    }

    @Test
    void testSave() {
    }

    @Test
    void testGetById() {
    }
}