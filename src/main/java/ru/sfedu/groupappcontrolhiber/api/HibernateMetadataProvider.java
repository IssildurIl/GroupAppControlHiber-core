package ru.sfedu.groupappcontrolhiber.api;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.NativeQuery;
import ru.sfedu.groupappcontrolhiber.Constants;
import ru.sfedu.groupappcontrolhiber.utils.HibernateUtil;

import java.util.List;

public class HibernateMetadataProvider implements MetaDataProvider {

    private static Logger log= LogManager.getLogger(HibernateMetadataProvider.class);

    @Override
    public List getAllSchemas() {
        Session session = getSession();
        NativeQuery query = session.createSQLQuery(Constants.SQL_ALL_SCHEMAS);
        List resultList = query.getResultList();
        session.close();
        log.info(String.format(Constants.CONT_COLUMN_HINT_OUT, resultList!=null ? resultList.size() : "Nothing"));
        return resultList;
    }

    public List getSQLHELP(){
        Session session = getSession();
        session.beginTransaction();
        var List = session.createSQLQuery(Constants.SQL_HELP).list();
        log.info(List);
        session.close();
        return List;
    }
    public List getAllTables(){
        Session session = getSession();
        session.beginTransaction();
        var List = session.createSQLQuery(Constants.SQL_ALL_TABLES).list();
        log.info(List);
        session.close();
        return List;
    }
    public List getAllUsers(){
        Session session = getSession();
        session.beginTransaction();
        var List = session.createSQLQuery(Constants.SQL_ALL_USERS).list();
        log.info(List);
        session.close();
        return List;
    }

    private Session getSession(){
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        return sessionFactory.openSession();
    }
}
