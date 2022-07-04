package bank.database;

import bank.Client;
import bank.database.hibernate.HiberUtil;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.List;
@Component
public class ClientDAOImpl implements ClientDAO{

    @Override
    public List<Client> getAllClient() {
        SessionFactory factory = HiberUtil.getSessionFactory();
        Session session = factory.openSession();
        session.beginTransaction();
        List<Client> clients = session.
                createQuery("FROM Client").
                getResultList();
        session.getTransaction().commit();
        factory.close();
        return clients;
    }

    @Override
    public Client getClientById(int id) {
        Client client = null;
        SessionFactory factory = HiberUtil.getSessionFactory();
        try (Session session = factory.openSession()) {
            session.beginTransaction();
            client = session.get(Client.class, id);
            session.getTransaction().commit();
            factory.close();
            return client;
        }
    }

    @Override
    public void save(Client client) {
        SessionFactory factory = HiberUtil.getSessionFactory();
        Session session = factory.openSession();
        session.beginTransaction();
        session.save(client);
        session.getTransaction().commit();
        factory.close();
    }
}
