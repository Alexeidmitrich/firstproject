package bank.database;

import bank.Director;
import bank.database.hibernate.HiberUtil;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.List;
@Component
public class DirectorDAOImpl implements DirectorDAO {
    @Override
    public List<Director> getAllDirector() {
        SessionFactory factory = HiberUtil.getSessionFactory();
        Session session = factory.openSession();
        session.beginTransaction();
        List<Director> director = session
                .createQuery("FROM Director")
                .getResultList();
        session.getTransaction().commit();
        factory.close();
        return  director;
    }

    @Override
    public Director getDirectorById(int id) {
        Director director = null;
        SessionFactory factory = HiberUtil.getSessionFactory();
        try (Session session = factory.openSession()) {
            session.beginTransaction();
            director = session.get(Director.class, id);
            session.getTransaction().commit();
            factory.close();
            return director;
        }
    }

    @Override
    public void save(Director director) {
        SessionFactory factory = HiberUtil.getSessionFactory();
        Session session = factory.openSession();
        session.beginTransaction();
        session.save(director);
        session.getTransaction().commit();
        factory.close();
    }
}
