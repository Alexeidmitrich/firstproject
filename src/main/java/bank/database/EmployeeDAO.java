package bank.database;

import bank.Employee;

import java.util.List;

public interface EmployeeDAO {

    List<Employee> getAllEmployee();
    Employee getEmployeeById(int id);
    void save(Employee employee);
}
