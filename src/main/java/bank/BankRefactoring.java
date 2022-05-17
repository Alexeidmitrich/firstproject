package bank;

import bank.database.*;

import java.sql.*;
import java.util.List;

public class BankRefactoring  extends Bank {

    private DBManager dbManager = new DBManager();
    private ClientDAO clientDAO = new ClientDAOImpl();
    private EmployeeDAO employeeDAO = new EmployeeDAOImpl();

    public BankRefactoring(String title, String address) {
        super(title, address);
    }

    public BankRefactoring(String title, String address, Director director) {
        super(title, address, director);
    }

    @Override
    public void printAllEmployees() {
        List<Employee> employees = employeeDAO.getAllEmployee();
        for (int i = 0; i < employees.size(); i++) {
            Employee employee =  employees.get(i);
            employee.printInformation();
        }
    }

    //DAO = Data Access Object
    /*
    CREATE
    READ
    UPDATE
    DELETE

    CRUD Applicvcation
     */
    @Override
    public void printClients() {
        List<Client> clients = clientDAO.getAllClient();
        for (int i = 0; i < clients.size(); i++) {
          Client client =  clients.get(i);
          client.printInformation();
        }
    }
    @Override
    public void addEmployee(int number, String name, String surname, int salary, int bankid) {
        Employee employee = new Employee(number, name, surname, salary, bankid);
        employeeDAO.save(employee);
    }


    @Override
    public void addClient(int number, String name, String surname, int serie, String passnumber, String email, String phone, String password, String salt, int numberDepartment) {
        Client client = new Client(number, name, surname, serie, passnumber, email, phone, password, salt, numberDepartment);
        clientDAO.save(client);
    }
}
