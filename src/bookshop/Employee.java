package bookshop;

public class Employee extends Person {

    private String department;
    private int number;
    private int salary;
    private  int salesPrice;

    public Employee(int number, String name, String surname,  int salary, String department) {
        super(name, surname);
        this.department = department;
        this.number = number;
        this.salary = salary;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public void printInformation() {
        System.out.println(getNumber()  + ") "+ getSurname() + " "  + getName() + ".");
    }

    public void printInformationWithSales() {
        System.out.println(getNumber()  + ") "+ getSurname() + " "  + getName() + " - продажи на " + salesPrice + ".");
    }

    public void addPrice(int price) {
        salesPrice += price;
    }

    public int getSalesPrice() {
        return salesPrice;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}
