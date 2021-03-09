package ru.sfedu.groupappcontrolhiber.lab2;

import lombok.extern.log4j.Log4j2;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import ru.sfedu.groupappcontrolhiber.lab3.api.MappedSuperclassDataProvider;
import ru.sfedu.groupappcontrolhiber.utils.Generator.TestEntityGenerator;

import java.util.Date;
@Log4j2
class TestEntityMetadataProviderTest {

    private static MappedSuperclassDataProvider instance = new MappedSuperclassDataProvider();

    @BeforeAll
    static void setEnv() {
        TestEntityGenerator tg = new TestEntityGenerator();
        tg.testEntityGen();
    }
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
        instance.save(testEntity);
        instance.save(testEntity1);
        instance.save(testEntity2);
    }


    @Test
    void delData(){
        TestEntityMetadataProvider instance = new TestEntityMetadataProvider();
        TestEntity testEntity = new TestEntity();
        testEntity.setName("Test45");
        testEntity.setDescription("description is bruh");
        testEntity.setDateCreated(new Date());
        testEntity.setCheck(true);
        instance.save(testEntity);
        instance.delete(testEntity);
    }

    @Test
    void getById(){
        TestEntityMetadataProvider instance = new TestEntityMetadataProvider();
        log.info(instance.getById( TestEntity.class,1L));
        Assertions.assertEquals("Test41",instance.getById(TestEntity.class,1L).getData().getName());
    }
    @Test
    void getByIdFail(){
        TestEntityMetadataProvider instance = new TestEntityMetadataProvider();
        Assertions.assertNull(instance.getById(TestEntity.class, 100L).getData());
    }

}