package bank;

import java.util.ArrayList;
import java.util.List;

public class Client extends Person{

    int ranking;
   // List<BankProduct> bankProductList = new ArrayList<>();
    List<Account> accountList = new ArrayList<>();
    List<Credit> creditList = new ArrayList<>();

    public Client(String name, String family, int number, int ranking) {
        super(name, family, number);
        this.ranking = ranking;
    }

    public void  openAccount(Account account) {
        accountList.add(account);
    }

    public void openCredit(Credit credit) {
        creditList.add(credit);
    }

    public void printAccount(){
        if (accountList.size() == 0) {
            System.out.println("Client " + getNumber() + " doesn't have any accounts");
        } else {
            for (int i = 0; i < accountList.size(); i++) {
                Account account = accountList.get(i);
                account.printInformation();

            }
        }
    }
    public void printCredit(){
        if(creditList.size() == 0){
            System.out.println("Credit " + getNumber() + " doesn't have any credit");
        }else {
            for (int i = 0; i < creditList.size(); i++) {
             Credit credit = creditList.get(i);
             credit.printInformation();
            }
        }
    }
}
