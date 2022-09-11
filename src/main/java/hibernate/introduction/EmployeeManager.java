package hibernate.introduction;

import hibernate.helper.HibernateUtil;
import hibernate.task2.Employee;
import org.hibernate.SessionFactory;

import javax.persistence.EntityManager;
import java.util.List;

public class EmployeeManager {
    private static final SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
    //private final EntityManager entityManager = sessionFactory.createEntityManager();


    public void addRecordsToDB(Object... objects){   //persist
        EntityManager entityManager = sessionFactory.createEntityManager();

        entityManager.getTransaction().begin();
        for (int i = 0; i < objects.length; i++) {
            entityManager.persist(objects[i]);
        }
        entityManager.getTransaction().commit();

        entityManager.close();

    }

    public void validateEmailAdresses() {
    }
    public void closeSession() {
        HibernateUtil.shutdown();
    }


}
