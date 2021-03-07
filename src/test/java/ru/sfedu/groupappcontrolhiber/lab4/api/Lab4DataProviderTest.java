package ru.sfedu.groupappcontrolhiber.lab4.api;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import ru.sfedu.groupappcontrolhiber.lab4.models.Address;
import ru.sfedu.groupappcontrolhiber.lab4.models.Inventory;
import ru.sfedu.groupappcontrolhiber.lab4.models.Item;
import ru.sfedu.groupappcontrolhiber.utils.Fill;


import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

class Lab4DataProviderTest {
    public static final Lab4DataProvider instance = new Lab4DataProvider();

    @BeforeAll
    static void setEnv() {
    }


    @Test
    void delete() {
    }

    @Test
    void save() {
        Item item = new Item();
        HashSet<String> progLangHS = new HashSet<String>(Arrays.asList(Fill.prLanguages));
        item.setProgrammingLanguage(progLangHS);
        item.setTeam(Arrays.asList(Fill.department));
        HashMap<String, String> nameAgeHM = new HashMap<String, String>();
        nameAgeHM.put("Kirill", "07.12.1987");
        nameAgeHM.put("Sergey", "12.10.1971");
        nameAgeHM.put("Elena", "11.01.1991");

        item.setMap(nameAgeHM);

        HashMap<String, Inventory> inventoryHashMap = new HashMap<String, Inventory>();
        Inventory inventory = new Inventory();
        inventory.setName("Laptop");
        inventory.setMark("HP_Pavilion");
        Inventory inventory1 = new Inventory();
        inventory1.setName("PC");
        inventory1.setMark("Core i9");
        Inventory inventory2 = new Inventory();
        inventory2.setName("ECM");
        inventory2.setMark("8086");
        inventoryHashMap.put("lap",inventory);
        inventoryHashMap.put("pc",inventory1);
        inventoryHashMap.put("ecm",inventory2);

        item.setCustommap(inventoryHashMap);

        Address address = new Address();
        address.setCity("SomeTown");
        address.setStreet("SomeStreet");

        item.setAddress(address);

        instance.save(item);

    }

    @Test
    void getById() {
    }
}