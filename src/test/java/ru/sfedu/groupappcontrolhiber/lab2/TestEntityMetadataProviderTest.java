package ru.sfedu.groupappcontrolhiber.lab2;

import lombok.extern.log4j.Log4j2;
import org.junit.jupiter.api.Test;
import ru.sfedu.groupappcontrolhiber.lab3.TablePerClass.Employee;
import ru.sfedu.groupappcontrolhiber.lab3.api.DataProvider;
import java.util.Date;
@Log4j2
class TestEntityMetadataProviderTest {

    private static DataProvider instance = new DataProvider();
    @Test
    void SaveData(){
        Address homeaddress = new Address();
        homeaddress.setCity("Rostov");
        homeaddress.setStreet("Eremenko");
        Address workaddress = new Address();
        workaddress.setCity("Rostov");
        workaddress.setStreet("Eremenko");


        TestEntity testEntity = new TestEntity();
        TestEntity testEntity1 = new TestEntity();
        TestEntity testEntity2 = new TestEntity();
        testEntity.setName("Test41");
        testEntity.setDescription("description");
        testEntity.setDateCreated(new Date());
        testEntity.setCheck(true);
        testEntity.setWorkAddress(workaddress);
        testEntity.setHomeAddress(homeaddress);



        testEntity1.setName("Test42");
        testEntity1.setDescription("description");
        testEntity1.setDateCreated(new Date());
        testEntity1.setCheck(true);
        testEntity.setHomeAddress(workaddress);

        testEntity2.setName("Test43");
        testEntity2.setDescription("description");
        testEntity2.setDateCreated(new Date());
        testEntity2.setCheck(true);
        TestEntityMetadataProvider instance = new TestEntityMetadataProvider();
        instance.saveTestEntity(testEntity);
        instance.saveTestEntity(testEntity1);
        instance.saveTestEntity(testEntity2);
    }

    @Test
    void delData(){
        TestEntityMetadataProvider instance = new TestEntityMetadataProvider();
        TestEntity testEntity = new TestEntity();
        testEntity.setName("Test45");
        testEntity.setDescription("description is bruh");
        testEntity.setDateCreated(new Date());
        testEntity.setCheck(true);
        instance.saveTestEntity(testEntity);
        instance.deleteTestEntity(testEntity);
    }

    @Test
    void getById(){
        TestEntityMetadataProvider instance = new TestEntityMetadataProvider();
        log.info(instance.getById(1L));
    }

    @Test
    void saveDataEmp(){
        Employee employee = new Employee();
     instance.save(employee);
    }

}