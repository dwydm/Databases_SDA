package hibernate.introduction;

import hibernate.helper.HibernateUtil;
import hibernate.task2.Employee;
import hibernate.task2.Phone;
import org.hibernate.SessionFactory;

import javax.persistence.EntityManager;
import java.time.LocalDate;

public class HibernateIntroduction {
    public static void main(String[] args) {
/*      Session session = HibernateUtil.getSessionFactory().openSession();

        session.beginTransaction();

        String sql = "SELECT VERSION();";
        String result = (String) session.createNativeQuery(sql).getSingleResult();
        System.out.println(result);


        session.getTransaction().commit();
        session.close();*//*



        final SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        final EntityManager entityManager = sessionFactory.createEntityManager();

        Employee empl1 = new Employee("Bob", "Dywan", LocalDate.now(),"lalaland@nope.zix");
        Employee empl2 = new Employee("Jason", "Domofon", LocalDate.now(),"qwert@nope.zix");
        Employee empl4 = new Employee("Auton", "Klakson", LocalDate.now(),"qwert@nope.zix");
        Employee empl3 = new Employee("Michael", "Klakson", LocalDate.now(),"qwsdad@ndad.zda");
        Employee empl5 = new Employee("Sandra", "Buldog", LocalDate.now(),"qwsdad@ndad.zda");

        Phone bphone3 = new Phone("1234098", "Szajsung", "Pauper 7D");
        Phone bphone1 = new Phone("12333398", "Burner", "Yellow Plum");
        Phone bphone2 = new Phone("88888888", "Karamba", "Box S3");
        bphone3.setEmployee(empl3);
        bphone1.setEmployee(empl5);
        bphone1.setEmployee(empl2);
        empl3.setPhone(bphone3);
        empl5.setPhone(bphone1);
        empl2.setPhone(bphone2);


        entityManager.getTransaction().begin();
        // CRUD
        entityManager.persist(empl1);
        entityManager.persist(empl2);
        //entityManager.persist(bphone3); dzieki cascade = cascadeType.ALL w klasie Employee, nie trzeba dodawać osobno obiektów
        entityManager.persist(empl3);
        entityManager.persist(empl4);
        entityManager.persist(empl5);
        //entityManager.flush(); // aktualizacja wczesniejsza w jednej transakcji


*//*        entityManager.getTransaction().commit();
        Employee emplz = entityManager.find(Employee.class, 1);
        System.out.println(emplz);*//*

*//*        Query query = entityManager.createQuery("from Employee as e where e.surname like:sm");
        query.setParameter("sm","Dywan");
        List<Employee> list = query.getResultList();

        list.forEach(System.out::println);*//*


        HibernateUtil.shutdown();*/


    }
}
