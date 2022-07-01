package bank.database.jpa;

import bank.Client;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.List;

public class DemoJPA {

    private static final String PERSISTENCE_UNIT_NAME = "todos";
    private static EntityManagerFactory factory;

    public static void main(String[] args) {
        factory = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT_NAME);
        EntityManager em = factory.createEntityManager();
        List<Client> list = em.createQuery("SELECT c FROM Client c").getResultList();
        for(int i = 0; i < list.size(); i++) {
            Client c = list.get(i);
            System.out.println(c);
        }
    }
}
