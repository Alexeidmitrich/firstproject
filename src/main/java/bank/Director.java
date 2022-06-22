package bank;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.Set;

@Entity
@Table(name = "director")
public class Director extends Person {

    private double salary;
    public Director(String name,String surname, double salary) {
        super(0, name, surname);
        this.salary = salary;
    }
    //@OneToMany(fetch = FetchType.LAZY, mappedBy = "director")
    //private Set<Employee> employees;

    public double getSalary() {
        return salary;
    }

    public void printInformation(){
        System.out.println(getName() + " " + getSurname() + " " + getSalary());

    }
}
