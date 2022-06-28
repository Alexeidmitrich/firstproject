package bank;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "director")
public class Director extends Person {

    private double salary;
    public Director(String firstname, String lastname, double salary) {
        super(0, firstname, lastname);
        this.salary = salary;
    }
    public Director(){

    }

    public double getSalary() {
        return salary;
    }

    public void printInformation(){
        System.out.println(getFirstname() + " " + getLastname() + " " + getSalary());

    }

}
