package bank;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

@Entity
@Table(name = "director")
@XmlAccessorType(XmlAccessType.FIELD)
public class Director extends Person{
    @XmlElement
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

    @Override
    public String toString() {
        return this.getNumber() + " " + this.getFirstname() +" " + this.getLastname() + " " + this.salary;
    }
}
