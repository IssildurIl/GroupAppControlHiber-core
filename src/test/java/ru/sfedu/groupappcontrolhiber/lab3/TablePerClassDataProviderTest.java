package ru.sfedu.groupappcontrolhiber.lab3;

import lombok.extern.log4j.Log4j2;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import ru.sfedu.groupappcontrolhiber.Constants;
import ru.sfedu.groupappcontrolhiber.lab3.TablePerClass.DevelopersTask;
import ru.sfedu.groupappcontrolhiber.lab3.TablePerClass.Task;
import ru.sfedu.groupappcontrolhiber.lab3.api.TablePerClassDataProvider;
import ru.sfedu.groupappcontrolhiber.utils.Generator.TablePerClassGenerator;
@Log4j2
class TablePerClassDataProviderTest {
    public static final TablePerClassDataProvider instance = new TablePerClassDataProvider();
    public static final TablePerClassGenerator inst = new TablePerClassGenerator();
    @BeforeAll
    static void setEnv() {
        inst.TablePerClassGen();
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
        log.info(Constants.TablePerClass + task.toString());
        DevelopersTask developersTask = instance.getById(DevelopersTask.class,11L).getData();
        log.info(Constants.TablePerClass + developersTask.toString());
        Assertions.assertEquals(11L,developersTask.getId());
    }
}