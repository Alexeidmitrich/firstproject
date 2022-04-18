package bank;

public class Employee extends Person {

    protected int salary;
    protected int number;

    public Employee(String name, String surname, int number, int salary) {
        super(name, surname, number);
        this.salary = salary;
    }

    public void printInformation(){
        System.out.println(getName() + " " + getSurname() + " " + getNumber() + " " + salary);
    }

    public void setSalary(int salary) {
        if (salary > 0) {
            this.salary = salary;
        }
    }
}

