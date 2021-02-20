package ru.sfedu.groupappcontrolhiber.utils;

import lombok.extern.log4j.Log4j2;
import ru.sfedu.groupappcontrolhiber.lab3.MappedSuperclass.*;
import ru.sfedu.groupappcontrolhiber.lab3.api.DataProvider;
import java.util.ArrayList;
import ru.sfedu.groupappcontrolhiber.enums.*;
import java.util.List;
import java.util.Random;


@Log4j2
public class Generator {
    public static DataProvider instance = new DataProvider();

    public static void addRecord() {

        for (int i=1; i<=10; i++) {
            Employee employee = new Employee();
            employee.setFirstName(Fill.firstName[i-1]);
            employee.setLastName(Fill.lastName[i-1]);
            employee.setLogin(Fill.login[i-1]);
            employee.setPassword(Fill.password[i-1]);
            employee.setEmail(Fill.email[i-1]);
            employee.setToken(Fill.token[i-1]);
            employee.setDepartment(Fill.department[i-1]);
            employee.setTypeOfEmployee(TypeOfEmployee.Employee);
            instance.save(employee);
        }
//        for (int i=1; i<=10; i++) {
//            Developer developer = new Developer();
//            developer.setFirstName(Fill.firstName[i-1]);
//            developer.setLastName(Fill.lastName[i-1]);
//            developer.setLogin(Fill.login[i-1]);
//            developer.setPassword(Fill.password[i-1]);
//            developer.setEmail(Fill.email[i-1]);
//            developer.setToken(Fill.token[i-1]);
//            developer.setDepartment(Fill.department[i-1]);
//            developer.setTypeOfEmployee(TypeOfEmployee.Developer);
//            developer.setStatus(TypeOfDevelopers.CUSTOM);
//            developer.setProgrammingLanguage(ProgrammingLanguage.Custom);
//            instance.saveDeveloper(developer);
//        }
//        for (int i=1; i<=10; i++) {
//            Tester tester = new Tester();
//            tester.setFirstName(Fill.firstName[i-1]);
//            tester.setLastName(Fill.lastName[i-1]);
//            tester.setLogin(Fill.login[i-1]);
//            tester.setPassword(Fill.password[i-1]);
//            tester.setEmail(Fill.email[i-1]);
//            tester.setToken(Fill.token[i-1]);
//            tester.setDepartment(Fill.department[i-1]);
//            tester.setTypeOfEmployee(TypeOfEmployee.Tester);
//            tester.setStatus(TypeOfDevelopers.CUSTOM);
//            tester.setProgrammingLanguage(ProgrammingLanguage.Custom);
//            tester.setTypeOfTester(TypeOfTester.Custom);
//            instance.saveTester(tester);
//        }
        for (int i=1; i<=10; i++) {
            Task task = new Task();
            task.setTaskDescription(Fill.taskDescription[i-1]);
            task.setMoney(Fill.money[i-1]);
            task.setScrumMaster(getScrum());
            task.setStatus(TypeOfCompletion.CUSTOM);
            task.setTeam(getListEmployee());
            task.setTaskType(TaskTypes.BASE_TASK);
            instance.save(task);
        }
//        for (int i=1; i<=10; i++) {
//            DevelopersTask developerTask = new DevelopersTask();
//            developerTask.setTaskDescription(Fill.taskDescription[i-1]);
//            developerTask.setMoney(Fill.money[i-1]);
//            //developerTask.setScrumMaster(getScrum());
//            developerTask.setStatus(TypeOfCompletion.CUSTOM);
//            //developerTask.setTeam(getListEmployee());
//            developerTask.setTaskType(TaskTypes.DEVELOPERS_TASK);
//            developerTask.setDeveloperTaskType(DeveloperTaskType.DEVELOPMENT);
//            instance.saveDevelopersTask(developerTask);
//        }
//        for (int i=1; i<=10; i++) {
//            TestersTask testersTask = new TestersTask();
//            testersTask.setTaskDescription(Fill.taskDescription[i-1]);
//            testersTask.setMoney(Fill.money[i-1]);
//            //testersTask.setScrumMaster(getScrum());
//            testersTask.setStatus(TypeOfCompletion.CUSTOM);
//            //testersTask.setTeam(getListEmployee());
//            testersTask.setTaskType(TaskTypes.TESTERS_TASK);
//            testersTask.setBugStatus(BugStatus.IN_WORK);
//            instance.saveTestersTask(testersTask);
//        }
    }
    public static Employee getScrum(){
        int max=10;
        Random random = new Random();
        long id = random.nextLong()%max;
        log.info(id);
        return instance.getById(Employee.class,Math.abs(id)).getData();
    }
    public static List<Employee> getListEmployee(){
        List<Employee> fullList = new ArrayList<>();
        int max=10;
        Random random = new Random();
        long id = random.nextLong()%max;
        for (int i=1;i<=3; i++) {
            Employee employee= instance.getById(Employee.class,Math.abs(id)).getData();
            fullList.add(employee);
        }
        return fullList;
    }
}
