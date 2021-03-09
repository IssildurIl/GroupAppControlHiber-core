package ru.sfedu.groupappcontrolhiber.utils.Generator;

import ru.sfedu.groupappcontrolhiber.enums.*;
import ru.sfedu.groupappcontrolhiber.lab5.models.*;
import ru.sfedu.groupappcontrolhiber.lab5.api.Lab5HQL;
import ru.sfedu.groupappcontrolhiber.utils.Fill;

import java.util.ArrayList;
import java.util.List;

public class Lab5Generator {
    public static Lab5HQL instance = new Lab5HQL();

    public void lab5Gen() {

        for (int i = 1; i <= 3; i++) {
            Address address = new Address();
            address.setCity(Fill.addressCity[i - 1]);
            address.setStreet(Fill.addressStreet[i - 1]);
            instance.save(address);

            Task task = new Task();
            task.setName("Task"+i);
            instance.save(task);

            Employee employee = new Employee();
            employee.setFirstName(Fill.firstName[i-1]);
            employee.setAddress(address);
            employee.setTask(task);
            instance.save(employee);

            Project project = new Project();
            project.setTitle(Fill.title[i-1]);
            project.setTask(task);
            instance.save(project);
        }
        for (int i = 1; i <= 3; i++) {
            Inventory inventory = new Inventory();
            inventory.setName(Fill.firstName[i-1]);
            inventory.setMark(Fill.inventoryMark[i-1]);
            instance.save(inventory);

            Developer developer = new Developer();
            developer.setId(inventory.getId());
            developer.setName(Fill.firstName[i-1]);
            developer.setInventory(inventory);
            instance.save(developer);

            List<Developer> developers = new ArrayList<>();
            developers.add(developer);
            developers.add(developer);

            DevelopersTask dt = new DevelopersTask();
            dt.setDeveloper(developers);
            dt.setName(Fill.title[i-1]);
            dt.setDeveloperTaskType(DeveloperTaskType.DEVELOPMENT);
            dt.setDeveloperComments("DevTask comment");
            instance.save(dt);
        }
        for (int i = 1; i <= 3; i++) {
            TestersTask tt = new TestersTask();
            tt.setBugDescription(Fill.taskDescription[i-1]);
            tt.setBugStatus(BugStatus.IN_WORK);
            instance.save(tt);


            SomeInformation someInformation = new SomeInformation();
            someInformation.setSomeInfos("INFO FOR TEST");
            someInformation.setTestersTask(tt);
            instance.save(someInformation);
        }
    }


}
