package warehouse;

import java.util.ArrayList;
import java.util.List;

public class Sklad {
    String title;
    String address;
    List<Employer> employerList = new ArrayList<>();
    List<Goods> goodsList = new ArrayList<>();

    public Sklad(String title, String address) {
        this.title = title;
        this.address = address;
    }

    public void addGoods(String title, int weight, String pointOffDeparture, String destination) {
        Goods goods = new Goods(title, weight, pointOffDeparture, destination);
        goodsList.add(goods);
    }

    public void printAllGoods() {
        for (int i = 0; i < employerList.size(); i++) {
            Goods result = goodsList.get(i);
            result.printInformation();
        }
    }
    public void addEmployer(String name, String surname, int money) {
        Employer employer = new Employer(name, surname, money);
        employerList.add(employer);
    }

    public void printAllEmployees() {
        for (int i = 0; i < employerList.size(); i++) {
            Employer result = employerList.get(i);
            result.printInformation();
        }
    }

    public void info() {
        System.out.println(title + " " + address);
    }

    public static void main(String[] args) {
        Sklad b = new Sklad("Amazon", "Dortmund");
        b.info();
        b.addEmployer("Ivan", "Abramov", 150000);
        b.addEmployer("Andrei", "Stepanov", 50000);
        b.printAllEmployees();
        b.addGoods("Suger", 1000, "Krasnodar", "St.Petersburg");
        b.addGoods("Salt", 1000, "Baskunchak", "St.Petrsburg");
        b.printAllGoods();
    }
}
