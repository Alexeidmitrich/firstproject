package bank;

public class Credit extends BankProduct{

    int month;

    public Credit(int id, String title, int amount, int month) {
        super(id, title, amount);
        this.month = month;
    }
}
