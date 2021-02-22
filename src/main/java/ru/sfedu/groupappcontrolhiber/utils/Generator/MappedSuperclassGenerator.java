package ru.sfedu.groupappcontrolhiber.utils.Generator;

import lombok.extern.log4j.Log4j2;
import ru.sfedu.groupappcontrolhiber.enums.ProgrammingLanguage;
import ru.sfedu.groupappcontrolhiber.enums.TypeOfDevelopers;
import ru.sfedu.groupappcontrolhiber.enums.TypeOfEmployee;
import ru.sfedu.groupappcontrolhiber.enums.TypeOfTester;
import ru.sfedu.groupappcontrolhiber.lab3.MappedSuperclass.Employee;
import ru.sfedu.groupappcontrolhiber.lab3.MappedSuperclass.Developer;
import ru.sfedu.groupappcontrolhiber.lab3.MappedSuperclass.Tester;
import ru.sfedu.groupappcontrolhiber.lab3.api.MappedSuperclassDataProvider;
import ru.sfedu.groupappcontrolhiber.utils.Fill;


@Log4j2
public class MappedSuperclassGenerator {
    MappedSuperclassDataProvider instance = new MappedSuperclassDataProvider();
    public void mappedSuperclassGen(){
        for (int i=1; i<=10; i++) {
            Employee employee = new Employee();
            setEmployee(employee,Fill.firstName[i-1],Fill.lastName[i-1],Fill.login[i-1],
                    Fill.password[i-1],Fill.email[i-1],Fill.token[i-1],Fill.department[i-1],TypeOfEmployee.Employee);
            //instance.save(employee);
        }
        for (int i=1; i<=10; i++) {
            Developer developer = new Developer();
            setDeveloper(developer,Fill.firstName[i-1],Fill.lastName[i-1], Fill.login[i-1],
                    Fill.password[i-1],Fill.email[i-1],Fill.token[i-1],Fill.department[i-1],TypeOfEmployee.Developer,
                    TypeOfDevelopers.CUSTOM,ProgrammingLanguage.Custom);
            instance.save(developer);
        }
        for (int i=1; i<=10; i++) {
            Tester tester = new Tester();
            setTester(tester,Fill.firstName[i-1],Fill.lastName[i-1], Fill.login[i-1],
                    Fill.password[i-1],Fill.email[i-1],Fill.token[i-1],Fill.department[i-1],TypeOfEmployee.Tester,
                    TypeOfDevelopers.CUSTOM,ProgrammingLanguage.Custom,TypeOfTester.Custom);
            instance.save(tester);
        }
    }

    public static void setEmployee(Employee employee, String firstname, String lastname, String login, String password, String email,
                                   String token, String department, TypeOfEmployee typeOfEmployee) {
        employee.setFirstName(firstname);
        employee.setLastName(lastname);
        employee.setLogin(login);
        employee.setPassword(password);
        employee.setEmail(email);
        employee.setToken(token);
        employee.setDepartment(department);
        employee.setTypeOfEmployee(typeOfEmployee);
    }

    public static void setTester(Tester tester, String firstname, String lastname, String login, String password, String email,
                                 String token, String department, TypeOfEmployee typeOfEmployee, TypeOfDevelopers status,
                                 ProgrammingLanguage programmingLanguage, TypeOfTester typeOfTester) {
        tester.setFirstName(firstname);
        tester.setLastName(lastname);
        tester.setLogin(login);
        tester.setPassword(password);
        tester.setEmail(email);
        tester.setToken(token);
        tester.setDepartment(department);
        tester.setTypeOfEmployee(typeOfEmployee);
        tester.setStatus(status);
        tester.setProgrammingLanguage(programmingLanguage);
        tester.setTypeOfTester(typeOfTester);
    }

    public static void setDeveloper(Developer developer, String firstname, String lastname, String login, String password, String email,
                                    String token, String department, TypeOfEmployee typeOfEmployee, TypeOfDevelopers status,
                                    ProgrammingLanguage programmingLanguage) {
        developer.setFirstName(firstname);
        developer.setLastName(lastname);
        developer.setLogin(login);
        developer.setPassword(password);
        developer.setEmail(email);
        developer.setToken(token);
        developer.setDepartment(department);
        developer.setTypeOfEmployee(typeOfEmployee);
        developer.setStatus(status);
        developer.setProgrammingLanguage(programmingLanguage);
    }


}
