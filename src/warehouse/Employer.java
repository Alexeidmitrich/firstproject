package warehouse;

public class Employer {
    String name;
    String surname;
    int money;

    public Employer(String name, String surname, int money) {
        this.name = name;
        this.surname = surname;
        this.money = money;
    }
    public void printInformation(){
        System.out.println(name + " " + surname + " " + money);
    }
}
