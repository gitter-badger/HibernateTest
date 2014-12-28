package fomichev;

import fomichev.model.Person;
import fomichev.util.HibernateUtil;
import org.hibernate.Session;

import java.sql.Date;

public class App {
    public static void main(String[] args) {
        Session session = HibernateUtil.getSessionFactory().getCurrentSession();
        session.beginTransaction();

        Person person = new Person();
        person.setName("Fomichev");
        person.setId(21l);
        person.setDateOfBirth(new Date(100000));
        session.save(person);

        session.getTransaction().commit();
        HibernateUtil.getSessionFactory().close();
    }
}
