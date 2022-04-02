package homework;


import bank.Client;
import bank.Employee;

import java.util.ArrayList;
import java.util.List;

public class Drink {

    List<Hotdrink> hotdrinkList = new ArrayList<>();
    List<Colddrink> colddrinkList = new ArrayList<>();

    public void addHotdrink(int id, String title, double volume, int price, String sugar) {
        Hotdrink hotdrink = new Hotdrink(id, title, volume, price, sugar);
        hotdrinkList.add(hotdrink);
    }
    public void choiceHotdrink(int idDrink){
        for (int i = 0; i < hotdrinkList.size(); i++) {
            Hotdrink hotdrink  = hotdrinkList.get(i);
            if (hotdrink.getId() == idDrink) {
                hotdrink.printHotdrink();
                break;
            }
        }
    }

    public void addColddrink(int id, String title, double volume, int price, String gas) {
        Colddrink colddrink = new Colddrink(id, title, volume, price, gas);
        colddrinkList.add(colddrink);
    }

    public void choiceColddrink(int idDrink){
        for (int i = 0; i < colddrinkList.size(); i++) {
            Colddrink colddrink  = colddrinkList.get(i);
            if (colddrink.getId() == idDrink) {
                colddrink.printColddrink();
                break;
            }
        }
    }
    public void printAllHotDrink() {
        for (int i = 0; i < hotdrinkList.size(); i++) {
            Hotdrink result = hotdrinkList.get(i);
            result.printInformation();
        }
    }
    public void printAllColdtDrink() {
        for (int i = 0; i < colddrinkList.size(); i++) {
            Colddrink result = colddrinkList.get(i);
            result.printInformation();
        }
    }

    public static void main(String[] args) {
        Drink d = new Drink();
        d.addHotdrink(10,"Americano", 0.2,110,"Without");
        d.addHotdrink(11,"Expresso",0.3, 200,"With");
        d.addHotdrink(12,"tea", 0.3, 80, "With");
        d.printAllHotDrink();
        d.choiceHotdrink(10);
        d.addColddrink(1,"Coca cola", 0.5, 100, "With");
        d.addColddrink(2,"Pepsi cola", 1, 150, "With");
        d.addColddrink(3,"Borjomi",0.5,98, "Without");
        d.addColddrink(4, "Essentuki", 0.5,75, "Without");
        d.printAllColdtDrink();
        d.choiceColddrink(3);
    }
}
