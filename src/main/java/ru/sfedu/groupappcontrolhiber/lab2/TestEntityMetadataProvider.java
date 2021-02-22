package ru.sfedu.groupappcontrolhiber.lab2;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import ru.sfedu.groupappcontrolhiber.enums.Outcomes;
import ru.sfedu.groupappcontrolhiber.utils.HibernateUtil;

import java.util.Optional;


public class TestEntityMetadataProvider {

    private static final Logger log= LogManager.getLogger(TestEntityMetadataProvider.class);

    private Session getSession(){
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        return sessionFactory.openSession();
    }

    public void saveTestEntity (TestEntity testEntity) {
        Session session=getSession();
        session.getTransaction().begin();
        session.save(testEntity);
        session.flush();
        session.close();
    }

    public void deleteTestEntity (TestEntity testEntity) {
        Session session=getSession();
        session.beginTransaction();
        session.delete(testEntity);
        session.flush();
        session.close();
    }

    public TestEntity getById (Long id) {
        Session session=getSession();
        try {
            session.beginTransaction();
            TestEntity testEntity = session.get(TestEntity.class, id);
            session.getTransaction().commit();
            session.close();
            return testEntity;
        }
        catch (Exception e){
            session.close();
            log.error(Outcomes.Fail);
            return null;
        }
    }
}
