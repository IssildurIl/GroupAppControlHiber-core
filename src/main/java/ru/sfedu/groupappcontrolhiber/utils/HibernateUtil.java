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
//    public static SessionFactory getSessionFactory() {
//        if (sessionFactory == null) {
//            // loads configuration and mappings
//            Configuration configuration = new Configuration().configure();
//            ServiceRegistry serviceRegistry
//                    = new StandardServiceRegistryBuilder()
//                    .applySettings(configuration.getProperties()).build();
//
//
//            MetadataSources metadataSources =
//                    new MetadataSources(serviceRegistry);
//            metadataSources.addAnnotatedClass(Employee.class);// Аннотированная сущность
//            metadataSources.addAnnotatedClass(Developer.class);
//            metadataSources.addAnnotatedClass(Tester.class);
//            sessionFactory = metadataSources.buildMetadata().buildSessionFactory();
//        }
//
//        return sessionFactory;
//    }

    public static SessionFactory getSessionFactory() {
        if (sessionFactory == null) {
            File file = new File(Constants.RESOURCE_PATH);
            sessionFactory = new Configuration().configure(file).buildSessionFactory();
        }

        return sessionFactory;
    }

}
