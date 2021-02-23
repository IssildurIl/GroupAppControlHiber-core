package ru.sfedu.groupappcontrolhiber.utils.Generator;

import ru.sfedu.groupappcontrolhiber.Constants;
import ru.sfedu.groupappcontrolhiber.enums.*;
import ru.sfedu.groupappcontrolhiber.lab3.TablePerClass.Employee;
import ru.sfedu.groupappcontrolhiber.lab3.TablePerClass.Task;
import ru.sfedu.groupappcontrolhiber.lab3.TablePerClass.DevelopersTask;
import ru.sfedu.groupappcontrolhiber.lab3.api.TablePerClassDataProvider;
import ru.sfedu.groupappcontrolhiber.utils.Fill;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TablePerClassGenerator {

    public static TablePerClassDataProvider instance = new TablePerClassDataProvider();

    public void TablePerClassGen(){
        for (int i = 1; i <= 10; i++) {
            Employee employee = new Employee();
            setEmployee(employee, Fill.firstName[i - 1], Fill.lastName[i - 1], Fill.login[i - 1],
                    Fill.password[i - 1], Fill.email[i - 1],
                    Fill.token[i - 1], Fill.department[i - 1], TypeOfEmployee.Employee);
            instance.save(employee);
        }
        for (int i=1; i<=10; i++) {
            Task task = new Task();
            setTask(task, Fill.taskDescription[i-1],Fill.money[i-1], getScrum(),
                    TypeOfCompletion.CUSTOM, getListEmployee(),
                    new Date(), new Date(), new Date(), TaskTypes.BASE_TASK);
            instance.save(task);
        }
        for (int i=1; i<=10; i++) {
            DevelopersTask testersTask = new DevelopersTask();
            setTestersTask(testersTask, Fill.taskDescription[i-1],Fill.money[i-1], getScrum(),
                    TypeOfCompletion.CUSTOM, getListEmployee(),
                    new Date(), new Date(), new Date(),TaskTypes.BASE_TASK, Constants.BaseComment,DeveloperTaskType.DEVELOPMENT);
            instance.save(testersTask);
        }
    }

    public static List<Employee> getListEmployee(){
        List<Employee> fullList = new ArrayList<>();
        for (int i=1;i<=3; i++) {
            fullList.add(getScrum());
        }
        return fullList;
    }
    public static Employee getScrum(){
        long max=10;
        return instance.getById(Employee.class,(long) Math.abs(Math.random()*max+1)).getData();
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

    public static void setTask(Task task, String taskDescription, double money,
                               Employee scrumMaster, TypeOfCompletion status, List<Employee> team,
                               Date createdDate, Date deadline, Date lastUpdate, TaskTypes taskType){
        task.setTaskDescription(taskDescription);
        task.setMoney(money);
        task.setScrumMaster(scrumMaster);
        task.setStatus(status);
        task.setTeam(team);
        task.setCreatedDate(createdDate);
        task.setDeadline(deadline);
        task.setLastUpdate(lastUpdate);
        task.setTaskType(taskType);
    }

    public static void setTestersTask(DevelopersTask task, String taskDescription, double money,
                                      Employee scrumMaster, TypeOfCompletion status, List<Employee> team,
                                      Date createdDate, Date deadline, Date lastUpdate,
                                      TaskTypes taskType, String comments, DeveloperTaskType taskTypes ){
        task.setTaskDescription(taskDescription);
        task.setMoney(money);
        task.setScrumMaster(scrumMaster);
        task.setStatus(status);
        task.setTeam(team);
        task.setCreatedDate(createdDate);
        task.setDeadline(deadline);
        task.setLastUpdate(lastUpdate);
        task.setTaskType(taskType);
        task.setDeveloperComments(comments);
        task.setDeveloperTaskType(taskTypes);
    }

}
