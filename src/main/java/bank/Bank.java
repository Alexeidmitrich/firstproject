package bank;

import javax.xml.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;
@XmlRootElement(name = "bank")
@XmlAccessorType(XmlAccessType.FIELD)
public class Bank {
    @XmlElement
    String title;
    String address;
    @XmlElement
    Director director;
    List<Employee> employeeList = new ArrayList<>();
    List<Client> clientList = new ArrayList<>();
    List<Credit> creditList = new ArrayList<>();
    @XmlElement(name = "bankDepartment")
    @XmlElementWrapper(name= "bankDepartments")
    List<BankDepartment> bankDepartments = new ArrayList<>();


    public Bank(String title, String address) {
        this.title = title;
        this.address = address;

    }

    public Bank(String title, String address, Director director) {
        this.title = title;
        this.address = address;
        this.director = director;
    }

    public Bank() {
    }

        @Override
        public String toString() {
            return "Bank{" +
                    "title='" + title + '\'' +
                    ", director=" + director +
                    ", bankDepartments=" + bankDepartments +
                    '}';
        }

        public void addClient(int number, String name, String surname, int serie, String passnumber, String email, String phone, String password, String salt, int numberDepartment) {
            Client client = new Client(number, name, surname, serie, passnumber, email, phone, password, salt, numberDepartment);
            clientList.add(client);
            System.out.println("New client was created");
        }

        public void openCredit(int numberClient, int numberCredit, String title, int amount, int month, int ranking) {
            Credit credit = new Credit(numberCredit, title, amount, month, ranking);
            boolean isApproved = false;
            for (int i = 0; i < clientList.size(); i++) {
                Client client = clientList.get(i);
                if (client.getNumber() == numberClient && ranking >= 5) {
                    client.openCredit(credit);
                    System.out.println("Credit is approved");
                    isApproved = true;
                    break;
                }
            }

            if (!isApproved) {
                System.out.println("Client id " + numberClient + " is not exist");
            }
        }

        public void printClientCredit(int numberClient) {
            for (int i = 0; i < clientList.size(); i++) {
                Client client = clientList.get(i);
                if (client.getNumber() == numberClient) {
                    client.printCredit();
                    break;
                }
            }
        }

        public void openAccount(int numberClient, int numberAccount, String title, int amount, boolean replenished) {
            Account account = new Account(numberAccount, title, amount, replenished);
            openAccount(account, numberClient);

        }

        public void openAccount(Account account, int numberClient) {
            boolean isOpend = false;
            for (int i = 0; i < clientList.size(); i++) {
                Client client = clientList.get(i);
                if (client.getNumber() == numberClient) {
                    client.openAccount(account);
                    System.out.println("Account is opened");
                    isOpend = true;
                    break;
                }
            }

            if (!isOpend) {
                System.out.println("Client id " + numberClient + " is not exist");
            }
        }

        public void printClientAccount(int numberClient) {
            for (int i = 0; i < clientList.size(); i++) {
                Client client = clientList.get(i);
                if (client.getNumber() == numberClient) {
                    client.printAccount();
                    break;
                }
            }
        }

        public void setNewSalary(int numberEmployee, int salary) {
            for (int i = 0; i < employeeList.size(); i++) {
                Employee emp = employeeList.get(i);
                if (emp.getNumber() == numberEmployee) {
                    emp.setSalary(salary);
                    break;
                }
            }
        }

        public void printEmployees() {
            for (int i = 0; i < employeeList.size(); i++) {
                Employee employee = employeeList.get(i);
                employee.printEmployee();
            }
        }

        public void whoIsDirector() {
            director.printInformation();
        }

        public void info() {
            System.out.println(title + " " + address);
        }


   /* public static void main(String[] args) {
        /*Director director = new Director("Alex", "A", 50000);
        Bank b = new Bank("Sberbank","Moskva" , director);
        b.info();
        b.whoIsDirector();
        b.setNewSalary(100, -1200);
        b.printEmployees();
        b.addClient(8, "Boris", "Pavlov", 4003, "754325", "alex@mail.ru", "+79519515151", "43b439fdbd320d266abe07e98e99062c", "9688751387ffbc048846008c7932eb12", 2);
        //b.addClient("Anastasia", "Pavlova", 5001, 5);
        b.openAccount(5001, 56, "Super account", 50000, true);
        b.printClientAccount(5001);
        b.openCredit(5000,28, "Econom",100000, 12,5);
        b.printClientCredit(5000);
    }*/

    }

