package hibernate.introduction;

import hibernate.helper.HibernateUtil;
import hibernate.task2.Employee;
import hibernate.task2.Phone;
import hibernate.task2.PhoneBrand;
import hibernate.task2.Projects;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import javax.persistence.EntityManager;
import java.time.LocalDate;
import java.util.List;

public class HibernateIntroduction {
    public static void main(String[] args) {

/*      Session session = HibernateUtil.getSessionFactory().openSession();

        session.beginTransaction();

        String sql = "SELECT VERSION();";
        String result = (String) session.createNativeQuery(sql).getSingleResult();
        System.out.println(result);


        session.getTransaction().commit();
        session.close();*/
        EmployeeManager employeeManager = new EmployeeManager();


//        final SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
//        final EntityManager entityManager = sessionFactory.createEntityManager();

        Employee empl1 = new Employee("Bob", "Dywan", LocalDate.now(), "bob@nothingshady.org");
        Employee empl2 = new Employee("Jason", "Domofon", LocalDate.now(), "qwert@nothingshady.org");
        Employee empl3 = new Employee("John", "Doe", LocalDate.now(), "john.doe@gmail.com");
        Employee empl4 = new Employee("Michael", "Klakson", LocalDate.now(), "horn@gmail.com");
        Employee empl5 = new Employee("Sandra", "Buldog", LocalDate.now(), "sabul@ndad.nothingshady.com");
        Employee empl6 = new Employee("John", "Poncho", LocalDate.now(), "poncho@ndad.nothingshady.com");
        Employee empl7 = new Employee("Helena", "Botomfarter", LocalDate.now(), "helena.botomfarter@ndad.nothingshady.com");
        Employee empl8 = new Employee("Benedict", "Cumberbatch", LocalDate.now(), "bc@ndad.nothingshady.com");
        Employee empl9 = new Employee("Barbituate", "Bumbersplat", LocalDate.now(), "aksfdgbf@ndad.nothingshady.com");

        Phone bphone1 = new Phone("12333398", PhoneBrand.CHEAPSTAKE);
        Phone bphone2 = new Phone("88888888", PhoneBrand.YOUPHONE);
        Phone bphone3 = new Phone("12340989", PhoneBrand.BURNER);
        Phone bphone4 = new Phone("91872333", PhoneBrand.YOUPHONE);
        Phone bphone5 = new Phone("12398329", PhoneBrand.YOUPHONE);
        Phone bphone6 = new Phone("12386792", PhoneBrand.BURNER);
        Phone bphone7 = new Phone("12938699", PhoneBrand.CHEAPSTAKE);
        Phone bphone8 = new Phone("12371928", PhoneBrand.CHEAPSTAKE);
        Phone bphone9 = new Phone("12938670", PhoneBrand.CHEAPSTAKE);

        Projects project1 = new Projects("My Little Project");

        project1.setEmployeeList(List.of(empl1,empl3,empl6));

        empl3.setPhone(bphone3);
        empl5.setPhone(bphone1);
        empl2.setPhone(bphone2);
        empl1.setPhone(bphone4);
        empl4.setPhone(bphone5);

        employeeManager.addRecordsToDB(bphone1, bphone2, bphone3, bphone4, bphone5, bphone6, bphone7, bphone8, bphone9);
        employeeManager.addRecordsToDB(empl1, empl2, empl3, empl4, empl5, empl6, empl7, empl8, empl9);
        employeeManager.addRecordsToDB(project1);

        //employeeManager.validateEmailAdresses();


        employeeManager.closeSession();


        //entityManager.getTransaction().begin();
/*
        // CRUD
        entityManager.persist(bphone3); //dzieki cascade = cascadeType.ALL w klasie Employee, nie trzeba dodawać osobno obiektów
        entityManager.persist(empl1);
        entityManager.persist(empl2);
        entityManager.persist(empl3);
        entityManager.persist(empl4);
        entityManager.persist(empl5);
        //entityManager.flush(); // aktualizacja wczesniejsza w jednej transakcji
*/


        //entityManager.getTransaction().commit();


/*        Employee emplz = entityManager.find(Employee.class, 1);
        System.out.println(emplz);*/

/*        Query query = entityManager.createQuery("from Employee as e where e.surname like:sm");
        query.setParameter("sm","Dywan");
        List<Employee> list = query.getResultList();

        list.forEach(System.out::println);*/


        //HibernateUtil.shutdown();
/*        Employee empl1 = new Employee("Bob", "Dywan", LocalDate.now(),"lalaland@nope.zix");
        Employee empl2 = new Employee("Jason", "Domofon", LocalDate.now(),"qwert@nope.zix");
        Employee empl4 = new Employee("Auton", "Klakson", LocalDate.now(),"qwert@nope.zix");
        Employee empl3 = new Employee("Michael", "Klakson", LocalDate.now(),"qwsdad@ndad.zda");
        Employee empl5 = new Employee("Sandra", "Buldog", LocalDate.now(),"qwsdad@ndad.zda");

        //EmployeeManager em = new EmployeeManager();

        //em.addRecordsToDB(empl1,empl2,empl3,empl4,empl5);*/

/*        final SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        final EntityManager entityManager = sessionFactory.createEntityManager();

        HibernateUtil.shutdown();*/
    }
}
