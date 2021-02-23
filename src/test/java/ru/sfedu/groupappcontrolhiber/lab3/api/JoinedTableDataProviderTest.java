package ru.sfedu.groupappcontrolhiber.lab3.api;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import ru.sfedu.groupappcontrolhiber.utils.Generator.JoinTableGenerator;

class JoinedTableDataProviderTest {

    public static JoinTableGenerator inst = new JoinTableGenerator();
    @BeforeAll
    static void setEnv() {
        inst.joinTableGen();
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