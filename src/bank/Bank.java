package bank;

import java.util.ArrayList;
import java.util.List;

public class Bank {

    String title;
    String address;
    Director director;
    List<Employee> employeeList = new ArrayList<>();

    public Bank(String title, String address, Director director){
           this. title  = title;
           this.address = address;
           this.director = director;
    }

    public void addEmployee(String name, String famaly, int number, int money){
        Employee employee = new Employee(name, famaly, number, money);
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



    }
}
