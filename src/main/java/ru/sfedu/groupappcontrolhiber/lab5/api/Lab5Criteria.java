package ru.sfedu.groupappcontrolhiber.lab5.api;

import lombok.extern.log4j.Log4j2;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import ru.sfedu.groupappcontrolhiber.Result;
import ru.sfedu.groupappcontrolhiber.enums.Outcomes;
import ru.sfedu.groupappcontrolhiber.lab5.models.Address;
import ru.sfedu.groupappcontrolhiber.lab5.models.Employee;
import ru.sfedu.groupappcontrolhiber.lab5.models.Project;
import ru.sfedu.groupappcontrolhiber.lab5.models.Task;
import ru.sfedu.groupappcontrolhiber.utils.HibernateUtil;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

@Log4j2
public class Lab5Criteria implements Lab5DataProvider{

    private Session getSession(){
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        return sessionFactory.openSession();
    }

    @Override
    public Result<Address> getProjectById(long id) {
        Session session = getSession();
        try {
            CriteriaBuilder cb = session.getCriteriaBuilder();
            CriteriaQuery<Address> cq = cb.createQuery(Address.class);
            Root<Address> root = cq.from(Address.class);
            cq.select(root).where(cb.equal(root.get("id"), id));
            Address task = session.createQuery(cq).getSingleResult();
            session.close();
            log.info(task.toString());
            return new Result<Address>(Outcomes.Complete,task);
        } catch (Exception exception) {
            session.close();
            log.error(exception);
            return new Result<>(Outcomes.Fail);
        }
    }
}
