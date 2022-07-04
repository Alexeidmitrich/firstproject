package bank.database;

import bank.Employee;
import org.springframework.stereotype.Component;

import java.util.List;
@Component
public interface EmployeeDAO {

    List<Employee> getAllEmployee();
    Employee getEmployeeById(int id);
    void save(Employee employee);
}
