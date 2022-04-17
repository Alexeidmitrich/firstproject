package bank;

public class Director extends Employee {


    public Director(String name,String surname, int money) {
        super(name, surname, 0,  money);
    }

    public void printInformation(){
        System.out.println(getName() + " " + getSurname() + " " + salary + " ");

    }
}
