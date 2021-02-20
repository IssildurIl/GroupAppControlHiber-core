package ru.sfedu.groupappcontrolhiber.lab3.api;

import lombok.extern.log4j.Log4j2;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import ru.sfedu.groupappcontrolhiber.Result;
import ru.sfedu.groupappcontrolhiber.enums.Outcomes;
import ru.sfedu.groupappcontrolhiber.utils.HibernateUtil;
@Log4j2
public class DataProvider {

    private Session getSession(){
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        return sessionFactory.openSession();
    }


    public <T> Result delete(T t) {
        Session session=getSession();
        session.beginTransaction();
        session.delete(t);
        session.flush();
        session.close();
        return new Result(Outcomes.Complete);
    }


    public <T> Result save(T t) {
        Session session=getSession();
        session.getTransaction().begin();
        session.save(t);
        session.flush();
        session.close();
        return new Result(Outcomes.Complete);
    }


    public <T> Result<T> getById(Class <T> tClass,Long id) {
        Session session=getSession();
        return (Result<T>) session.get(tClass,id);
    }


}
