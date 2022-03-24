package bank;

public class Director {
    String name;
    String famaly;
    int money;

    public Director(String name,String famaly, int money) {
        this.name = name;
        this.famaly = famaly;
        this.money = money;
    }

    public void printInformation(){
        System.out.println(name + " " + famaly + " " + money);
    }

}
