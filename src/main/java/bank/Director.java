package bank;

import javax.persistence.Entity;

@Entity
public class Director extends Employee {


    public Director(String name,String surname, int salary) {
        super(0, name, surname,  salary);
    }

    public void printInformation(){
        System.out.println(getName() + " " + getSurname() + " " + getSalary());

    }
}
