package warehouse;

public class Goods {
    String title;
    int weight;
    String pointOffDeparture;
    String destination;

    public Goods(String title, int weight, String pointOffDeparture, String destination){
        this.title = title;
        this.weight = weight;
        this.pointOffDeparture = pointOffDeparture;
        this.destination = destination;
    }
    public void printInformation(){
        System.out.println(title + " " + weight + " " + pointOffDeparture+ " " + destination);
    }

}
