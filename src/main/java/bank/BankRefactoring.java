package bank;

import bank.database.*;

import java.util.List;

public class BankRefactoring {
    private String title;
    private String address;
    private Director director;

    private DBManager dbManager = new DBManager();
    private ClientDAO clientDAO = new ClientDAOImpl();
    private EmployeeDAO employeeDAO = new EmployeeDAOImpl();
    private BankDepartmentDAO bankDepartmentDAO = new BankDepartmentsDAOImpl();

    public void addClient(String name, String surname, int serie, String passnumber, String email, String phone, String password, String salt, int numberDepartment) {
        Client client = new Client(name, surname, serie, passnumber, email, phone, password, salt, numberDepartment);
        clientDAO.save(client);
    }
    public void addBank(String city){
        BankDepartment bankDepartment = new BankDepartment(city);
        bankDepartmentDAO.save(bankDepartment);
    }

    public void printEmployees() {
        List<Employee> employees = employeeDAO.getAllEmployee();
        for (int i = 0; i < employees.size(); i++) {
            Employee employee = employees.get(i);
            employee.printAllEmployee();
        }
    }

    public void printClients() {
        List<Client> clients = clientDAO.getAllClient();
        for (int i = 0; i < clients.size(); i++) {
            Client client = clients.get(i);
            client.printInformation();
        }
    }

    public void addEmployee(String name, String surname, double salary, int bankid) {
        Employee employee = new Employee(name, surname, salary);
        employeeDAO.save(employee, bankid);
    }
}
