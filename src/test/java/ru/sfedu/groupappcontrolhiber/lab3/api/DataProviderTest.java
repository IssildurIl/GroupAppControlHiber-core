package ru.sfedu.groupappcontrolhiber.lab3.api;

import lombok.extern.log4j.Log4j2;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
@Log4j2
class DataProviderTest {

    public static DataProvider instance = new DataProvider();
    @BeforeAll
    static void setJDBCEnv() {

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