package bank;

public class Account extends BankProduct {

    boolean replenished;

    public Account(int id, String title, int amount, boolean replenished) {
        super(id, title, amount);
        this.replenished = replenished;
    }

    public Account(int id, String title, boolean replenished){
       this(id, title, 0, replenished );
    }

}
