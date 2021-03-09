package ru.sfedu.groupappcontrolhiber.utils.Generator;

import ru.sfedu.groupappcontrolhiber.enums.TypeOfEmployee;
import ru.sfedu.groupappcontrolhiber.lab4.models.Address;
import ru.sfedu.groupappcontrolhiber.lab4.api.Lab4DataProvider;
import ru.sfedu.groupappcontrolhiber.lab4.models.Employee;
import ru.sfedu.groupappcontrolhiber.lab4.models.Inventory;
import ru.sfedu.groupappcontrolhiber.lab4.models.Item;
import ru.sfedu.groupappcontrolhiber.utils.Fill;

import java.util.*;

public class Lab4Generator {

    public static Lab4DataProvider instance = new Lab4DataProvider();

    public void lab4Gen(){

        for (int i = 1; i <= 10; i++) {
            Item item = new Item();
            HashSet<String> progLangHS = new HashSet<String>(Arrays.asList(Fill.prLanguages));
            item.setProgrammingLanguage(progLangHS);
            item.setTeam(Arrays.asList(Fill.department));

            HashMap<String, String> nameAgeHM = new HashMap<String, String>();
            nameAgeHM.put(Fill.firstName[i-1], Fill.createdDate[i-1]);
            item.setMap(nameAgeHM);

            Inventory inventory = new Inventory();
            inventory.setMark(Fill.inventoryMark[i-1]);
            inventory.setName(Fill.firstName[i-1]);

            HashMap<String, Inventory> inventoryHashMap = new HashMap<String, Inventory>();
            inventoryHashMap.put(Fill.taskDescription[i-1],inventory);
            item.setCustommap(inventoryHashMap);

            Address address = new Address();
            address.setCity(Fill.addressCity[i-1]);
            address.setStreet(Fill.addressStreet[i-1]);

            item.setAddress(address);

            instance.save(item);
        }

    }

    public static void setEmployee(Employee employee, String firstname,
                                   String lastname, String login, String password,
                                   String email,String token, String department,
                                   TypeOfEmployee typeOfEmployee){
        employee.setFirstName(firstname);
        employee.setLastName(lastname);
        employee.setLogin(login);
        employee.setPassword(password);
        employee.setEmail(email);
        employee.setToken(token);
        employee.setDepartment(department);
        employee.setTypeOfEmployee(typeOfEmployee);
    }

}
