package bank;

public class BankProduct {
    int id;
    String title;
    int amount;

    public BankProduct(int id, String title, int amount) {
        this.id = id;
        this.title = title;
        this.amount = amount;
    }

    public void  printInformation(){
        System.out.println("id: " +id + ", title " + title + ", amount "  + amount);
    }
}
