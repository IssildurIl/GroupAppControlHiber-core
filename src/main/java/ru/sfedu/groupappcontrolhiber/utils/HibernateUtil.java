package ru.sfedu.groupappcontrolhiber.utils;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import ru.sfedu.groupappcontrolhiber.Constants;

import java.io.File;

public class HibernateUtil {
    private static SessionFactory sessionFactory;
    /**
     * Создание фабрики
     *
     */
    public static SessionFactory getSessionFactory() {
        if (sessionFactory == null) {
            File file = new File(Constants.RESOURCE_PATH);
            sessionFactory = new Configuration().configure(file).buildSessionFactory();
        }

        return sessionFactory;
    }

}
