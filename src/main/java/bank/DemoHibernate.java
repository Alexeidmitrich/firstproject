package bank;

import bank.database.BankDepartmentDAO;
import bank.database.BankDepartmentsDAOImpl;
import bank.database.EmployeeDAO;
import bank.database.EmployeeDAOImpl;

public class DemoHibernate {

    public static void main(String[] args) {
        BankDepartmentDAO departmentDAO = new BankDepartmentsDAOImpl();
        EmployeeDAO employeeDAO = new EmployeeDAOImpl();
        BankDepartment department = departmentDAO.getById(1);
        Employee employee  = new Employee("A", "B", department, 50000);
        employeeDAO.save(employee);
    }
}
