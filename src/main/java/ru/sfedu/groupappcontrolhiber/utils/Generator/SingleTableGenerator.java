package ru.sfedu.groupappcontrolhiber.utils.Generator;

import ru.sfedu.groupappcontrolhiber.enums.TaskTypes;
import ru.sfedu.groupappcontrolhiber.enums.TypeOfCompletion;
import ru.sfedu.groupappcontrolhiber.enums.TypeOfEmployee;
import ru.sfedu.groupappcontrolhiber.lab3.SingleTable.Employee;
import ru.sfedu.groupappcontrolhiber.lab3.SingleTable.Task;
import ru.sfedu.groupappcontrolhiber.lab3.SingleTable.TestersTask;
import ru.sfedu.groupappcontrolhiber.utils.Fill;

public class SingleTableGenerator {

    public void singleTableGen(){
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
        }
//        for (int i=1; i<=10; i++) {
//            Task task = new Task();
//            task.setTaskDescription(Fill.taskDescription[i-1]);
//            task.setMoney(Fill.money[i-1]);
//            task.setScrumMaster(getScrum());
//            task.setStatus(TypeOfCompletion.CUSTOM);
//            task.setTeam(getListEmployee());
//            task.setCreatedDate(Fill.createdDate[i-1]);
//            task.setDeadline(Fill.deadline[i-1]);
//            task.setLastUpdate(Fill.lastUpdate[i-1]);
//            task.setTaskType(TaskTypes.BASE_TASK);
//
//        }
//        for (int i=1; i<=10; i++) {
//            TestersTask testersTask = new TestersTask();
//            testersTask.setTaskDescription(Fill.taskDescription[i-1]);
//            testersTask.setMoney(Fill.money[i-1]);
//            testersTask.setScrumMaster(getScrum());
//            testersTask.setStatus(TypeOfCompletion.CUSTOM);
//            testersTask.setTeam(getListEmployee());
//            testersTask.setCreatedDate(Fill.createdDate[i-1]);
//            testersTask.setDeadline(Fill.deadline[i-1]);
//            testersTask.setLastUpdate(Fill.lastUpdate[i-1]);
//            testersTask.setTaskType(TaskTypes.TESTERS_TASK);
//            testersTask.setBugStatus(BugStatus.IN_WORK);


        }
    }
