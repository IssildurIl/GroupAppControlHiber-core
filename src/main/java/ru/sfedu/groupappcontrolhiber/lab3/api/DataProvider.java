package ru.sfedu.groupappcontrolhiber.lab3.api;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import ru.sfedu.groupappcontrolhiber.lab3.models.*;
import ru.sfedu.groupappcontrolhiber.utils.HibernateUtil;

public class DataProvider implements MetaDataProvider {

    private static final Logger log= LogManager.getLogger(DataProvider.class);

    private Session getSession(){
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        return sessionFactory.openSession();
    }

    @Override
    public void deleteEmployee(Employee employee) {
        Session session=getSession();
        session.beginTransaction();
        session.delete(employee);
        session.flush();
        session.close();
    }

    @Override
    public void saveEmployee(Employee employee) {
        Session session=getSession();
        session.getTransaction().begin();
        session.save(employee);
        session.flush();
        session.close();
    }

    @Override
    public Employee getEmployeeById(Long id) {
        Session session=getSession();
        return session.get(Employee.class,id);
    }

    @Override
    public void deleteDeveloper(Developer developer) {
        Session session=getSession();
        session.beginTransaction();
        session.delete(developer);
        session.flush();
        session.close();
    }

    @Override
    public void saveDeveloper(Developer developer) {
        Session session=getSession();
        session.getTransaction().begin();
        session.save(developer);
        session.flush();
        session.close();
    }

    @Override
    public Developer getDeveloperById(Long id) {
        Session session=getSession();
        return session.get(Developer.class,id);
    }

    @Override
    public void deleteTester(Tester tester) {
        Session session=getSession();
        session.beginTransaction();
        session.delete(tester);
        session.flush();
        session.close();
    }

    @Override
    public void saveTester(Tester tester) {
        Session session=getSession();
        session.getTransaction().begin();
        session.save(tester);
        session.flush();
        session.close();
    }

    @Override
    public Tester getTesterById(Long id) {
        Session session=getSession();
        return session.get(Tester.class,id);
    }

    @Override
    public void deleteTask(Task task) {
        Session session=getSession();
        session.beginTransaction();
        session.delete(task);
        session.flush();
        session.close();
    }

    @Override
    public void saveTask(Task task) {
        Session session=getSession();
        session.getTransaction().begin();
        session.save(task);
        session.flush();
        session.close();
    }

    @Override
    public Task getTaskById(Long id) {
        Session session=getSession();
        return session.get(Task.class,id);
    }

    @Override
    public void deleteDevelopersTask(DevelopersTask developersTask) {
        Session session=getSession();
        session.beginTransaction();
        session.delete(developersTask);
        session.flush();
        session.close();
    }

    @Override
    public void saveDevelopersTask(DevelopersTask developersTask) {
        Session session=getSession();
        session.getTransaction().begin();
        session.save(developersTask);
        session.flush();
        session.close();
    }

    @Override
    public DevelopersTask getDevelopersTaskById(Long id) {
        Session session=getSession();
        return session.get(DevelopersTask.class,id);
    }

    @Override
    public void deleteTestersTask(TestersTask testersTask) {
        Session session=getSession();
        session.beginTransaction();
        session.delete(testersTask);
        session.flush();
        session.close();
    }

    @Override
    public void saveTestersTask(TestersTask testersTask) {
        Session session=getSession();
        session.getTransaction().begin();
        session.save(testersTask);
        session.flush();
        session.close();
    }

    @Override
    public TestersTask getTestersTaskById(Long id) {
        Session session=getSession();
        return session.get(TestersTask.class,id);
    }
}
