package ru.sfedu.groupappcontrolhiber.lab2;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import ru.sfedu.groupappcontrolhiber.Result;
import ru.sfedu.groupappcontrolhiber.enums.Outcomes;
import ru.sfedu.groupappcontrolhiber.utils.HibernateUtil;

import java.util.Optional;


public class TestEntityMetadataProvider {

    private static final Logger log= LogManager.getLogger(TestEntityMetadataProvider.class);

    private Session getSession(){
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        return sessionFactory.openSession();
    }


    public <T> Result<T> delete(T t) {
        Session session=getSession();
        session.beginTransaction();
        session.delete(t);
        session.flush();
        session.close();
        return new Result<T>(Outcomes.Complete);
    }


    public <T> Result<T> save(T t) {
        Session session=getSession();
        session.getTransaction().begin();
        session.save(t);
        session.flush();
        session.close();
        return new Result<T>(Outcomes.Complete);
    }


    public <T> Result<T> getById(Class<T> tClass, Long id) {
        Session session=getSession();
        try {
            session.beginTransaction();
            T t = session.get(tClass, id);
            session.getTransaction().commit();
            session.close();
            return new Result<T>(Outcomes.Complete,t);
        }
        catch (Exception e){
            session.close();
            log.error(Outcomes.Fail);
            return null;
        }
    }

    public <T> Result<T> update(T t) {
        Session session=getSession();
        session.getTransaction().begin();
        session.saveOrUpdate(t);
        session.flush();
        session.close();
        return new Result<T>(Outcomes.Complete);
    }
}
