package ru.sfedu.groupappcontrolhiber.utils.Generator;

import ru.sfedu.groupappcontrolhiber.enums.ProgrammingLanguage;
import ru.sfedu.groupappcontrolhiber.enums.TypeOfDevelopers;
import ru.sfedu.groupappcontrolhiber.enums.TypeOfEmployee;
import ru.sfedu.groupappcontrolhiber.lab3.JoinedTable.Developer;
import ru.sfedu.groupappcontrolhiber.lab3.JoinedTable.Employee;
import ru.sfedu.groupappcontrolhiber.utils.Fill;

public class JoinTableGenerator {

    public void joinTableGen(){
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
        for (int i=1; i<=10; i++) {
            Developer developer = new Developer();
            developer.setFirstName(Fill.firstName[i-1]);
            developer.setLastName(Fill.lastName[i-1]);
            developer.setLogin(Fill.login[i-1]);
            developer.setPassword(Fill.password[i-1]);
            developer.setEmail(Fill.email[i-1]);
            developer.setToken(Fill.token[i-1]);
            developer.setDepartment(Fill.department[i-1]);
            developer.setTypeOfEmployee(TypeOfEmployee.Developer);
            developer.setStatus(TypeOfDevelopers.CUSTOM);
            developer.setProgrammingLanguage(ProgrammingLanguage.Custom);

        }
    }
}
