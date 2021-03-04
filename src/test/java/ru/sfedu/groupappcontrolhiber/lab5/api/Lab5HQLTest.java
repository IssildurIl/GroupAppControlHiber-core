package ru.sfedu.groupappcontrolhiber.lab5.api;

import lombok.extern.log4j.Log4j2;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import ru.sfedu.groupappcontrolhiber.enums.BugStatus;
import ru.sfedu.groupappcontrolhiber.enums.DeveloperTaskType;
import ru.sfedu.groupappcontrolhiber.enums.TypeOfDevelopers;
import ru.sfedu.groupappcontrolhiber.lab5.models.*;

import java.util.ArrayList;
import java.util.List;
@Log4j2
class Lab5HQLTest {
    public static final Lab5HQL hql = new Lab5HQL();
    public static final Lab5Criteria criteria = new Lab5Criteria();
    public static final Lab5NativeSQL sql = new Lab5NativeSQL();
    @BeforeAll
    static void setEnv() {

    }

    @Test
    public void start(){
        Address address = new Address();
        address.setCity("City");
        address.setStreet("Street");
        hql.save(address);

        Task task = new Task();
        task.setName("test task");
        hql.save(task);

        Employee employee = new Employee();
        employee.setFirstName("Van");
        employee.setAddress(address);
        employee.setTask(task);
        hql.save(employee);

        Project project = new Project();
        project.setTitle("Project 1");
        project.setTask(task);
        hql.save(project);


        Inventory inventory =new Inventory();
        inventory.setName("PC");
        inventory.setMark("Intel");
        hql.save(inventory);

        Developer developer = new Developer();
        developer.setId(inventory.getId());
        developer.setName("Test Developer");
        developer.setInventory(inventory);
        log.info(developer.toString());
        hql.save(developer);

        List<Developer> developers = new ArrayList<>();
        developers.add(developer);

        DevelopersTask dt = new DevelopersTask();
        dt.setDeveloper(developers);
        dt.setName("DevelopersTask name");
        dt.setDeveloperTaskType(DeveloperTaskType.DEVELOPMENT);
        dt.setDeveloperComments("Test DevTask");
        hql.save(dt);

        TestersTask tt = new TestersTask();
        tt.setBugDescription("description");
        tt.setBugStatus(BugStatus.IN_WORK);
        hql.save(tt);


        SomeInformation someInformation = new SomeInformation();
        someInformation.setSomeInfos("INFO FOR TEST");
        someInformation.setTestersTask(tt);
        log.info(someInformation.toString());
        hql.save(someInformation);
    }
    @Test
    public void CriteriaTest() throws InterruptedException {
        long start = System.currentTimeMillis();
        criteria.getTaskById(4L);
        Thread.sleep(1000);
        long finish = System.currentTimeMillis();
        long elapsed = finish - start;
        log.info("Criteria test Прошло времени, мс: " + elapsed);
    }

    @Test
    public void HQLTest() throws InterruptedException {
        long start = System.currentTimeMillis();
        hql.getTaskById(4L);
        Thread.sleep(1000);
        long finish = System.currentTimeMillis();
        long elapsed = finish - start;
        log.info("HQL test Прошло времени, мс: " + elapsed);
    }

    @Test
    public void SQLTest() throws InterruptedException {
        long start = System.currentTimeMillis();
        sql.getTaskById(4L);
        Thread.sleep(1000);
        long finish = System.currentTimeMillis();
        long elapsed = finish - start;
        log.info("SQL test Прошло времени, мс: " + elapsed);
    }
}