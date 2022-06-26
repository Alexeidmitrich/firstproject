package bank.database;

import bank.BankDepartment;
import bank.Client;
import bank.database.hibernate.HiberUtil;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import java.util.List;

public class ClientDAONewImpl  implements ClientDAO{
    @Override
    public List<Client> getAllClient() {
        SessionFactory factory = HiberUtil.getSessionFactory();
        Session session = factory.openSession();
        session.beginTransaction();
        List<Client> clients = session
                .createQuery("from Client")
                .getResultList();
        session.getTransaction().commit();
        factory.close();
        return  clients;
    }

    @Override
    public Client getClientById(int id) {
        return null;
    }

    @Override
    public void save(Client client) {
        SessionFactory factory = HiberUtil.getSessionFactory();
        Session session = factory.openSession();
        session.beginTransaction();
        session.save(client);
        session.getTransaction().commit();


    }

    public static void main(String[] args) {
        ClientDAO dao = new ClientDAONewImpl();
        List<Client> clients = dao.getAllClient();
        for (int i = 0; i < clients.size(); i++) {
            clients.get(i).printInformation();
        }
    }
}
