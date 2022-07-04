package bank;

import bank.database.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class BankRefactoring {
    @Autowired
    private ClientDAO clientDAO;
    @Autowired
    private BankDepartmentDAO bankDepartmentDAO;
    @Autowired
    private DirectorDAO directorDAO;
    @Autowired
    private EmployeeDAO employeeDAO;

    public void addBank(String city){
        BankDepartment bankDepartment = new BankDepartment(city);
        bankDepartmentDAO.save(bankDepartment);
    }
    public void addDirector(String firstname, String lastname, double salary){
        Director director = new Director(firstname, lastname, salary);
        directorDAO.save(director);
    }
    public void addEmployee(String firstname, String lastname, double salary) {
        Employee employee = new Employee(firstname, lastname, salary);
        employeeDAO.save(employee);
        System.out.println("New employee was created");
    }
    public void addClient(String firstname,String lastname, int serie, String passnumber, String email, String phone, String password, String salt, int numberDepartment) {
        Client client = new Client(firstname, lastname, serie, passnumber, email, phone, password, salt, numberDepartment);
        clientDAO.save(client);
        System.out.println("New client was created");
    }

    public void printEmployees() {
        List<Employee> employees = employeeDAO.getAllEmployee();
        for (int i = 0; i < employees.size(); i++) {
            Employee employee = employees.get(i);
            employee.printEmployee();
        }
    }

    public void printClients() {
        List<Client> clients = clientDAO.getAllClient();
        for (int i = 0; i < clients.size(); i++) {
            Client client = clients.get(i);
            client.printClient();
        }
    }
}
