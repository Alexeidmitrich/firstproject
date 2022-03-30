package bank;

public class Employee extends Person {

    int money;

    public Employee(String name, String family, int number, int money) {
        super(name, family, number);
        this.money = money;
    }

    public void printInformation(){
        System.out.println(name + " " + family + " " + money + " " + number);
    }
}

