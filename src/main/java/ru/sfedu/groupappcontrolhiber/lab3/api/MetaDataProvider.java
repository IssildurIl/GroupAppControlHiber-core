package ru.sfedu.groupappcontrolhiber.lab3.api;

import ru.sfedu.groupappcontrolhiber.lab3.models.*;

public interface MetaDataProvider {

    void deleteEmployee(Employee employee);
    void saveEmployee(Employee employee);
    Employee getEmployeeById(Long id);

    void deleteDeveloper(Developer developer);
    void saveDeveloper(Developer developer);
    Developer getDeveloperById(Long id);

    void deleteTester(Tester tester);
    void saveTester(Tester tester);
    Tester getTesterById(Long id);

    void deleteTask(Task task);
    void saveTask(Task task);
    Task getTaskById(Long id);

    void deleteDevelopersTask(DevelopersTask developersTask);
    void saveDevelopersTask(DevelopersTask developersTask);
    DevelopersTask getDevelopersTaskById(Long id);

    void deleteTestersTask(TestersTask testersTask);
    void saveTestersTask(TestersTask testersTask);
    TestersTask getTestersTaskById(Long id);
}
