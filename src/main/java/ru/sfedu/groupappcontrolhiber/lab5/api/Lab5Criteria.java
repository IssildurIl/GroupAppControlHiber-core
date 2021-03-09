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
    public Result<Project> getProjectById(long id) {
        Session session = getSession();
        try {
            CriteriaBuilder cb = session.getCriteriaBuilder();
            CriteriaQuery<Project> cq = cb.createQuery(Project.class);
            Root<Project> root = cq.from(Project.class);
            cq.select(root).where(cb.equal(root.get("id"), id));
            Project project = session.createQuery(cq).getSingleResult();
            session.close();
            log.info(project.toString());
            return new Result<Project>(Outcomes.Complete,project);
        } catch (Exception exception) {
            session.close();
            log.error(exception);
            return new Result<>(Outcomes.Fail);
        }
    }
}
