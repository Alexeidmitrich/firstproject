package bank;

import java.util.ArrayList;
import java.util.List;

public class Bank {

    String title;
    String address;
    Director director;
    List<Employee> employeeList = new ArrayList<>();
    List<Client> clientList = new ArrayList<>();
    List<Credit> creditList = new ArrayList<>();

    public Bank(String title, String address, Director director){
           this. title  = title;
           this.address = address;
           this.director = director;
    }

    public void addClient(String name, String family, int number, int ranking) {
        Client client = new Client(name, family, number, ranking);
        clientList.add(client);
        System.out.println("New client was created");
    }

    public  void openCredit(int numberClient, int numberCredit, String title, int amount, int month){
        Credit credit = new Credit(numberCredit, title, amount, month);
        boolean isApproved = false;
        for (int i = 0; i < creditList.size(); i++) {
         // Credit slavery  = creditList.get(i);
            Client client = clientList.get(i);
          if(client.number == numberClient) {
              client.openCredit(credit);
              System.out.println("Credit is approved");
              isApproved = true;
              break;
          }
        }
    }

    public void printClientCredit(int numberClient) {
        for (int i = 0; i < clientList.size(); i++) {
            Client client  = clientList.get(i);
            if (client.number ==  numberClient) {
                client.printCredit();
                break;
            }
        }
    }
    public void openAccount(int numberClient, int numberAccount, String title,int amount, boolean replenished){
        Account account = new Account(numberAccount, title, amount, replenished);
        boolean isOpend = false;
        for (int i = 0; i < clientList.size(); i++) {
            Client client  = clientList.get(i);
            if (client.number ==  numberClient) {
                client.openAccount(account);
                System.out.println("Account is opened");
                isOpend = true;
                break;
            }
        }

        if (!isOpend){
            System.out.println("Client id " + numberClient + " is not exist");
        }
    }

    public void printClientAccount(int numberClient) {
        for (int i = 0; i < clientList.size(); i++) {
            Client client  = clientList.get(i);
            if (client.number ==  numberClient) {
                client.printAccount();
                break;
            }
        }
    }

    public void addEmployee(String name, String family, int number, int money){
        Employee employee = new Employee(name, family, number, money);
        employeeList.add(employee);
    }

    public void printAllEmployees() {
        for (int i = 0; i < employeeList.size(); i++) {
          Employee result = employeeList.get(i);
            result.printInformation();
        }
    }

    public void whoIsDirector(){
        director.printInformation();
    }

    public void info(){
        System.out.println(title + " " + address);
    }

    public static void main(String[] args) {
        Director director = new Director("Alex", "A", 50000);
        Bank b = new Bank("Sberbank","Moskva" , director);
        b.info();
        b.whoIsDirector();
        b.addEmployee("Vasja", "Ivanov", 100, 1000);
        b.addEmployee("Masha", "Ivanova", 110, 1000);
        b.printAllEmployees();
        b.addClient("Boris", "Pavlov", 5000, 5);
        b.addClient("Anastasia", "Pavlova", 5001, 5);
        b.openAccount(5001, 56, "Super account", 50000, true);
        b.printClientAccount(5002);

        b.openCredit(5000,28, "Econom",100000, 12);
        b.printClientCredit(5000);
    }
}
