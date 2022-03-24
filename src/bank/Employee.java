package bank;

public class Employee {
    String name;
    String famaly;
    int money;

    int number;
    public Employee(String name, String famaly, int number, int money) {
        this.name = name;
        this.famaly = famaly;
        this.number = number;
        this.money = money;
    }
    public void printInformation(){
        System.out.println(name + " " + famaly + " " + money + " " + number);
    }
}

