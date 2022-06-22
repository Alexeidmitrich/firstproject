package bank;

import javax.persistence.*;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
@Table(name = "person")
public abstract class Person {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private int number;
    @Column(name = "firstname",nullable = false, length = 50)
    private String name;
    @Column(name="lastname", nullable = false, length = 55)
    private String surname;

    public Person() {
    }

    public Person(int number, String name, String surname) {
        this.number = number;
        this.name = name;
        this.surname = surname;
    }

    public Person(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public void printInformation(){
        System.out.println(getName() + " " + getSurname() + " " + getNumber());
    }
    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }
}
