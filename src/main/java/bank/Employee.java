package bank;

public class Employee extends Person {

    protected double salary;
    //protected int bankid;
    protected BankDepartment bankDepartment;

    public Employee(int number, String name, String surname, double salary, BankDepartment bankDepartment) {
        super(name, surname, number);
        this.salary = salary;
        this.bankDepartment = bankDepartment;
    }

    public Employee(int number, String name, String surname,  double salary) {
        super(name, surname, number);
        this.salary = salary;
    }

    public Employee(String name, String surname, double salary) {
        super(name, surname);
        this.salary = salary;
    }

    public void printAllEmployee(){
        System.out.println(getNumber() + " " + getName() + " " + getSurname() +  getSalary() + " " + bankDepartment.getCity());
    }

    public void setSalary(double salary) {
        if (salary > 0) {
            this.salary = salary;
        }
    }

    public double getSalary() {
        return salary;
    }

    public BankDepartment getBankDepartment() {
        return bankDepartment;
    }

    public void setBankDepartment(BankDepartment bankDepartment) {
        this.bankDepartment = bankDepartment;
    }
}

