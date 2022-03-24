package hotel;

import java.util.ArrayList;
import java.util.List;

public class Hostel {
    String title;
    String address;
    List<Employers> employersList = new ArrayList<>();

    public Hostel(String title, String address) {
        this.title = title;
        this.address = address;
    }

    public void addEmployers(String name, String surname, int money) {
        Employers employers = new Employers(name, surname, money);
        employersList.add(employers);
    }

    public void printAllEmployers() {
        for (int i = 0; i < employersList.size(); i++) {
            Employers result = employersList.get(i);
            result.printInformation();
        }
    }

    public void info() {
        System.out.println(title + " " + address);
    }

    public static void main(String[] args) {
        Hostel b = new Hostel("Dolphin ", "Anapa");
        b.info();
        b.addEmployers("Svetlana", "Alekseeva", 45000);
        b.addEmployers("Zhanna", "Alekseeva", 50000);
        b.addEmployers("Ivan","Gorshkov", 48000);
        b.printAllEmployers();
        //gi
    }
}
