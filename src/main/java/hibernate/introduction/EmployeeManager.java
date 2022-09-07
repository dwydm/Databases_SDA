package hibernate.introduction;

import hibernate.helper.HibernateUtil;
import org.hibernate.SessionFactory;

import javax.persistence.EntityManager;

public class EmployeeManager {
    private static final SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
    //private final EntityManager entityManager = sessionFactory.createEntityManager();



    public void closeSession() {
        HibernateUtil.shutdown();
    }


}
