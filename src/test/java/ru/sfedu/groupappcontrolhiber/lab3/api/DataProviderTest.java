package ru.sfedu.groupappcontrolhiber.lab3.api;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import ru.sfedu.groupappcontrolhiber.lab3.generator.Generator;
import ru.sfedu.groupappcontrolhiber.lab3.models.Task;


class DataProviderTest {
    private static final Logger log= LogManager.getLogger(DataProvider.class);
    public static DataProvider instance = new DataProvider();
    @BeforeAll
    static void setJDBCEnv() {
        Generator.addRecord();
    }

    @Test
    void deleteEmployee() {
    }

    @Test
    void saveEmployee() {
    }

    @Test
    void getEmployeeById() {
    }

    @Test
    void deleteDeveloper() {
    }

    @Test
    void saveDeveloper() {
    }

    @Test
    void getDeveloperById() {
    }

    @Test
    void deleteTester() {
    }

    @Test
    void saveTester() {
    }

    @Test
    void getTesterById() {
    }

    @Test
    void deleteTask() {
    }

    @Test
    void saveTask() {
    }

    @Test
    void getTaskById() {
        Task task = instance.getTaskById(1L);
    }

    @Test
    void deleteDevelopersTask() {
    }

    @Test
    void saveDevelopersTask() {
    }

    @Test
    void getDevelopersTaskById() {
    }

    @Test
    void deleteTestersTask() {
    }

    @Test
    void saveTestersTask() {
    }

    @Test
    void getTestersTaskById() {
    }
}