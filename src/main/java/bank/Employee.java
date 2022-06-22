package bank;

import javax.persistence.*;
import javax.persistence.Entity;
@Entity
@Table(name = "employee")
public class Employee extends Person {
    @Column(nullable = false, length = 10)

    private double salary;


    //@ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    //private Director director;

    public Employee(int number, String name, String surname, double salary) {
        super(number, name, surname);
        this.salary = salary;

    }


    public Employee(String name, String surname, double salary) {
        super(name, surname);
        this.salary = salary;
    }

    public void printAllEmployee(){
        System.out.println(getNumber() + " " + getName() + " " + getSurname() +  getSalary());
    }

    public void setSalary(double salary) {
        if (salary > 0) {
            this.salary = salary;
        }
    }

    public double getSalary() {
        return salary;
    }

}

