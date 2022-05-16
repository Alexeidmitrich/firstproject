package homework;

public class Properties {
     private int id;
    private String title;
    private double volume;
    private int price;

    public Properties(int id, String title, double volume, int price) {
        this.id = id;
        this.title = title;
        this.volume = volume;
        this.price = price;
    }

    public void  printInformation(){
            System.out.println("id: "+ id + ", title " + title + ", volume "  + volume + ", price " + price);
    }
    public void setId(int id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public double getVolume() {
        return volume;
    }

    public int getPrice() {
        return price;
    }
}
