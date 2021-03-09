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

import javax.persistence.Query;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

@Log4j2
public class Lab5NativeSQL implements Lab5DataProvider{
    private Session getSession(){
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        return sessionFactory.openSession();
    }

    @Override
    public Result<Project> getProjectById(long id) {
        Session session = getSession();
        try {
            Query query = session.createQuery("select u from Project u where u.id=:id", Project.class)
                    .setParameter("id",id);
            Project project = (Project) query.getSingleResult();
            log.debug(query);
            return new Result<>(Outcomes.Complete,project);
        } catch (Exception exception) {
            session.close();
            log.error(exception);
            return new Result<>(Outcomes.Fail);
        }
    }
}
