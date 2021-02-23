package ru.sfedu.groupappcontrolhiber.lab3.api;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import ru.sfedu.groupappcontrolhiber.utils.Generator.JoinTableGenerator;
import ru.sfedu.groupappcontrolhiber.utils.Generator.SingleTableGenerator;

import static org.junit.jupiter.api.Assertions.*;

class SingleTableDataProviderTest {

    public static SingleTableGenerator inst = new SingleTableGenerator();
    @BeforeAll
    static void setEnv() {
        inst.singleTableGen();
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