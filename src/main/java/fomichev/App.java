package fomichev;

import fomichev.model.Employee;
import fomichev.model.Person;
import fomichev.util.HibernateUtil;
import org.hibernate.Session;

import java.lang.reflect.Modifier;
import java.sql.Date;

public class App {
    public static void main(String[] args) {
//        Session session = HibernateUtil.getSessionFactory().getCurrentSession();
//        session.beginTransaction();
//        Person person = (Person) session.get(Person.class, 10l);
//        session.getTransaction().commit();
//        HibernateUtil.getSessionFactory().close();
//        System.err.println(person);
        System.err.println(Modifier.isAbstract(Person.class.getModifiers()));
    }
}
