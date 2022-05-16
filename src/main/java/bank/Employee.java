package bank;

public class Employee extends Person {

    protected int salary;
    protected int bank_id;


    public Employee(int number, String name, String surname, int salary, int bank_id) {
        super(name, surname, number);
        this.salary = salary;
        this.bank_id = bank_id;
    }

    public void printInformation(){
        System.out.println(getNumber() + " " + getName() + " " + getSurname() + " "  + salary);
    }

    public void setSalary(int salary) {
        if (salary > 0) {
            this.salary = salary;
        }
    }
}

