package ru.sfedu.groupappcontrolhiber.utils;

import org.hibernate.SessionFactory;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import ru.sfedu.groupappcontrolhiber.Constants;
import ru.sfedu.groupappcontrolhiber.lab3.MappedSuperclass.Developer;
import ru.sfedu.groupappcontrolhiber.lab3.MappedSuperclass.Employee;
import ru.sfedu.groupappcontrolhiber.lab3.MappedSuperclass.Tester;

import java.io.File;

public class HibernateUtil {
    private static SessionFactory sessionFactory;
    /**
     * Создание фабрики
     *
     */

    public static SessionFactory getSessionFactory() {
        File nf;
        if (sessionFactory == null) {
            nf = new File(Constants.RESOURCE_PATH);
        } else{
            nf= new File(Constants.CONFIG_PATH);
        }
        sessionFactory = new Configuration().configure(nf).buildSessionFactory();
        return sessionFactory;
    }

}
