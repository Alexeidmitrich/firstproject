package bookshop;

public class Director extends Person {

    public Director(String name, String surname) {
        super(name, surname);
    }
    public void printInformation(){
        System.out.println("Директор " + getName() + " " + getSurname());
    }
}
