package ru.sfedu.groupappcontrolhiber.lab3;

import lombok.extern.log4j.Log4j2;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import ru.sfedu.groupappcontrolhiber.Constants;
import ru.sfedu.groupappcontrolhiber.lab3.SingleTable.Task;
import ru.sfedu.groupappcontrolhiber.lab3.SingleTable.TestersTask;
import ru.sfedu.groupappcontrolhiber.lab3.api.SingleTableDataProvider;
import ru.sfedu.groupappcontrolhiber.utils.Generator.SingleTableGenerator;

@Log4j2
class SingleTableDataProviderTest {
    public static final SingleTableDataProvider instance= new SingleTableDataProvider();
    public static final SingleTableGenerator inst = new SingleTableGenerator();
    @BeforeAll
    static void setEnv() {
        inst.singleTableGen();
    }


    @Test
    void delete() {
        Task task = instance.getById(Task.class,2L).getData();
        instance.delete(task);
        Assertions.assertNull(instance.getById(Task.class, 2L).getData());
    }

    @Test
    void save() {
    }

    @Test
    void getById() {
        Task task = instance.getById(Task.class,1L).getData();
        log.info(Constants.SingleTable + task.toString());
        TestersTask testersTask = instance.getById(TestersTask.class,11L).getData();
        log.info(Constants.SingleTable + testersTask.toString());
        Assertions.assertEquals(11L,testersTask.getId());
    }
}