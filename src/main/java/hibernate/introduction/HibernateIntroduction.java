package hibernate.introduction;

import hibernate.helper.HibernateUtil;
import hibernate.task2.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import java.time.LocalDate;
import java.util.List;

public class HibernateIntroduction {
    public static void main(String[] args) {
/*        Session session = HibernateUtil.getSessionFactory().openSession();

        session.beginTransaction();

        String sql = "SELECT VERSION();";
        String result = (String) session.createNativeQuery(sql).getSingleResult();
        System.out.println(result);


        session.getTransaction().commit();
        session.close();*/



        final SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        final EntityManager entityManager = sessionFactory.createEntityManager();

        Employee empl1 = new Employee("Bob", "Dywan", LocalDate.now(),"lalaland@nope.zix");
        Employee empl2 = new Employee("Jason", "Domofon", LocalDate.now(),"qwert@nope.zix");
        Employee empl4 = new Employee("Auton", "Klakson", LocalDate.now(),"qwert@nope.zix");
        Employee empl3 = new Employee("Michael", "Klakson", LocalDate.now(),"qwsdad@ndad.zda");
        Employee empl5 = new Employee("Sandra", "Dywan", LocalDate.now(),"qwsdad@ndad.zda");


        entityManager.getTransaction().begin();
        // CRUD
        entityManager.persist(empl1);
        entityManager.persist(empl2);
        entityManager.persist(empl3);
        entityManager.persist(empl4);
        entityManager.persist(empl5);
        entityManager.flush(); // aktualizacja wczesniejsza w jednej transakcji


        entityManager.getTransaction().commit();
        Employee emplz = entityManager.find(Employee.class, 1);
        System.out.println(emplz);

        Query query = entityManager.createQuery("from Employee as e where e.surname like:sm");
        query.setParameter("sm","Dywan");
        List<Employee> list = query.getResultList();

        list.forEach(System.out::println);


        HibernateUtil.shutdown();
    }
}
