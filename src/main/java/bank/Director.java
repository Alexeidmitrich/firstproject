package bank;

public class Director extends Employee {


    public Director(String name,String surname, int money) {
        super(0, name, surname,  money, 0);
    }

    public void printInformation(){
        System.out.println(getName() + " " + getSurname() + " " + salary + " ");

    }
}
