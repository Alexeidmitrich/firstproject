package bank;

public class Director extends Employee {


    public Director(String name,String surname, int money) {
        super(0, name, surname,  money);
    }

    public void printInformation(){
        System.out.println(getName() + " " + getSurname() + " " + salary + " ");

    }
}
