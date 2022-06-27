package bank.database.hibernate;

import bank.*;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

public class HiberUtil {
    private static SessionFactory sessionFactory;
    public static SessionFactory getSessionFactory() {

        try {
            Configuration configuration = new Configuration().configure("hibernate.cfg.xml");
            configuration.addAnnotatedClass(Client.class);
            configuration.addAnnotatedClass(Person.class);
            configuration.addAnnotatedClass(Employee.class);
            configuration.addAnnotatedClass(Director.class);
           // configuration.addAnnotatedClass(BankDepartment.class);
            ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder()
                    .applySettings(configuration.getProperties()).build();

            sessionFactory = configuration.buildSessionFactory(serviceRegistry);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return sessionFactory;
    }
}
