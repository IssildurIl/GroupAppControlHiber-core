package ru.sfedu.groupappcontrolhiber.utils.Generator;

import ru.sfedu.groupappcontrolhiber.enums.TypeOfEmployee;
import ru.sfedu.groupappcontrolhiber.lab4.api.Lab4DataProvider;
import ru.sfedu.groupappcontrolhiber.lab4.models.Employee;
import ru.sfedu.groupappcontrolhiber.utils.Fill;

import java.util.ArrayList;
import java.util.List;

public class Lab4Generator {

    public static Lab4DataProvider instance = new Lab4DataProvider();

    public Employee lab4Gen(){
        Employee employee = new Employee();
        for (int i = 1; i <= 1; i++) {
            setEmployee(employee, Fill.firstName[i - 1], Fill.lastName[i - 1], Fill.login[i - 1],
                    Fill.password[i - 1], Fill.email[i - 1],
                    Fill.token[i - 1], Fill.department[i - 1], TypeOfEmployee.Employee);
        }
        return employee;
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

    public  List<Employee> getListEmployee(){
        List<Employee> fullList = new ArrayList<>();
        for (int i=1;i<=3; i++) {
            fullList.add(lab4Gen());
        }
        return fullList;
    }
}
