package bank;

public class Employee extends Person {

    private int salary;

    public Employee(String name, String family, int number, int salary) {
        super(name, family, number);
        this.salary = salary;
    }

    public void printInformation(){
        System.out.println(getName() + " " + getFamily() + " " + salary + " " + getNumber());
    }

    public void setSalary(int salary) {
        if (salary > 0) {
            this.salary = salary;
        }
    }
}

