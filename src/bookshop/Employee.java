package bookshop;

public class Employee extends Person{

    private int number;
    public Employee(int number, String name, String surname) {
        super( name, surname);
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    @Override
    public void printInformation() {
        System.out.println(getNumber()  + ") "+ getSurname() + " "  + getName() + ".");
    }
}
