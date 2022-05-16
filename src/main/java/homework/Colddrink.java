package homework;

import bank.Account;

import java.util.ArrayList;
import java.util.List;

public class Colddrink extends Properties {

    String gas;
    List<Colddrink> colddrinkList = new ArrayList<>();

    public Colddrink(int id, String title, double volume, int price, String gas) {
        super(id, title, volume, price);
        this.gas = gas;
    }
    public void  choiceColddrink(Colddrink colddrink) {
        colddrinkList.add(colddrink);
    }

    public void printColddrink() {
        if (colddrinkList.size() == 0) {
            System.out.println("Beverage " + getId() + " not found");
        } else {
            for (int i = 0; i < colddrinkList.size(); i++) {
                Colddrink colddrink = colddrinkList.get(i);
                colddrink.printInformation();
            }
        }
    }

    @Override
    public void printInformation() {
        System.out.println("id: " +getId() + ", title " + getTitle() + ", volume "  + getVolume() + ", price " + getPrice() + ", gas " + gas);
    }
}
