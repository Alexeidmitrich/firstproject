package bank.database;

import bank.Employee;
import bank.database.hibernate.HiberUtil;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import java.util.List;

public class EmployeeDAOImpl implements EmployeeDAO{

    @Override
    public List<Employee> getAllEmployee() {
        SessionFactory factory = HiberUtil.getSessionFactory();
        Session session = factory.openSession();
        session.beginTransaction();
        List<Employee> employee = session
                .createQuery("FROM Employee")
                .getResultList();
        session.getTransaction().commit();
        factory.close();
        return  employee;
    }

    @Override
    public Employee getEmployeeById(int id) {
        Employee employee = null;
        SessionFactory factory = HiberUtil.getSessionFactory();
        try (Session session = factory.openSession()) {
            session.beginTransaction();
            employee = session.get(Employee.class, id);
            session.getTransaction().commit();
            factory.close();
            return employee;
        }
    }

   @Override
    public void save(Employee employee) {
       SessionFactory factory = HiberUtil.getSessionFactory();
       Session session = factory.openSession();
       session.beginTransaction();
       session.save(employee);
       session.getTransaction().commit();
       factory.close();
    }
}

