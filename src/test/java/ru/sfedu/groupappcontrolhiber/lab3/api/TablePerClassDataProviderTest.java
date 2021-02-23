package ru.sfedu.groupappcontrolhiber.lab3.api;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import ru.sfedu.groupappcontrolhiber.utils.Generator.MappedSuperclassGenerator;
import ru.sfedu.groupappcontrolhiber.utils.Generator.TablePerClassGenerator;

import static org.junit.jupiter.api.Assertions.*;

class TablePerClassDataProviderTest {

    public static TablePerClassGenerator inst = new TablePerClassGenerator();
    @BeforeAll
    static void setEnv() {
        inst.TablePerClassGen();
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
}