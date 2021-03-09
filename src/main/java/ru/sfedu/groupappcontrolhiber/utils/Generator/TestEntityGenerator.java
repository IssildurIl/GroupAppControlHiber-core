package ru.sfedu.groupappcontrolhiber.utils.Generator;

import ru.sfedu.groupappcontrolhiber.enums.TypeOfEmployee;
import ru.sfedu.groupappcontrolhiber.lab2.Address;
import ru.sfedu.groupappcontrolhiber.lab2.TestEntity;
import ru.sfedu.groupappcontrolhiber.lab2.TestEntityMetadataProvider;
import ru.sfedu.groupappcontrolhiber.utils.Fill;

import java.util.Date;

public class TestEntityGenerator {

    TestEntityMetadataProvider instance = new TestEntityMetadataProvider();

    public void testEntityGen() {
        for (int i = 1; i <= 10; i++) {
            TestEntity testEntity = new TestEntity();
            Address address = new Address();
            address.setCity(Fill.addressCity[i-1]);
            address.setStreet(Fill.addressStreet[i-1]);
            testEntity.setName("Test"+i);
            testEntity.setDescription("description");
            testEntity.setHomeAddress(address);
            testEntity.setWorkAddress(address);
            testEntity.setCheck(true);
            testEntity.setDateCreated(new Date());
            instance.save(testEntity);
        }
    }
}
