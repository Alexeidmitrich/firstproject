package bank.database;

import bank.BankDepartment;
import bank.database.hibernate.HiberUtil;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import javax.persistence.Entity;
import java.util.List;

public class BankDepartmentsDAOImpl  implements BankDepartmentDAO{
    @Override
    public void save(BankDepartment bankDepartment) {
        SessionFactory factory = HiberUtil.getSessionFactory();
        Session session = factory.openSession();
        session.beginTransaction();
        session.save(bankDepartment);
        session.getTransaction().commit();
        factory.close();
    }

    @Override
    public List<BankDepartment> getAllDepartments() {
        SessionFactory factory = HiberUtil.getSessionFactory();
        Session session = factory.openSession();
        session.beginTransaction();
        List<BankDepartment> departments = session
                .createQuery("from BankDepartment")
                .getResultList();
         session.getTransaction().commit();
        factory.close();
        return  departments;
    }

    @Override
    public BankDepartment getById(int id) {
        BankDepartment department = null;
        SessionFactory factory = HiberUtil.getSessionFactory();
        Session session = factory.openSession();
        try {
            session.beginTransaction();
            department =session.get(BankDepartment.class, id);
            session.getTransaction().commit();
        } catch (Exception e) {
            factory.close();
        }
        return department;
    }

    @Override
    public void deleteById(int id) {
        SessionFactory factory = HiberUtil.getSessionFactory();
        Session session = factory.openSession();
        try {
            session.beginTransaction();
        BankDepartment department = session.get(BankDepartment.class, id);
        session.delete(department);
            session.getTransaction().commit();
        } catch (Exception e) {
            factory.close();
        }
    }

    public static void main(String[] args) {
        BankDepartment bankDepartment = new BankDepartment( "Kazan");
        BankDepartmentDAO dao = new BankDepartmentsDAOImpl();
        dao.deleteById(9);
        BankDepartment department = dao.getById(9);
        department.print();

    }
}
