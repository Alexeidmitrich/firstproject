package homework;

import java.util.ArrayList;
import java.util.List;

public class Hotdrink extends Properties{
    String  sugar;
    List<Hotdrink> hotdrinkList = new ArrayList<>();

    public Hotdrink(int id, String title, double volume,int  price, String sugar) {
        super(id, title, volume, price);
        this.sugar = sugar;
    }
    public void  choiceHotdrink(Hotdrink hotdrink) {
        hotdrinkList.add(hotdrink);
    }

    public void printHotdrink(){
        if (hotdrinkList.size() == 0) {
            System.out.println("Beverage " + getId() + " not found");
        } else {
            for (int i = 0; i < hotdrinkList.size(); i++) {
                Hotdrink hotdrink = hotdrinkList.get(i);
                hotdrink.printInformation();

            }
        }
    }

    @Override
    public void printInformation() {
        System.out.println("id: " +getId() + ", title " + getTitle() + ", volume "  + getVolume() + ", price " + getPrice() + ", sugar " + sugar);
    }
}
