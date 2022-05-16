package bank;

public class Credit extends BankProduct{
    int month;
    int ranking;

    public Credit(int id, String title, int amount, int month, int ranking) {
        super(id, title, amount);
        this.month = month;
        this.ranking = ranking;
    }

    @Override
    public void printInformation() {
        System.out.println("id: " +id + ", title " + title + ", amount "  + amount + ", month " + month + ", ranking " + ranking);
    }
}
