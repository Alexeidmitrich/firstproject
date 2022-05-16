package bank;

import java.util.ArrayList;
import java.util.List;

public class Client extends Person{

    protected int serie;
    protected String passnumber;
    protected String email;
    protected String phone;
    protected String password;
    protected String salt;
    protected int number_department;
    List<Account> accountList = new ArrayList<>();
    List<Credit> creditList = new ArrayList<>();

    public Client(int number, String name, String surname, int serie, String passnumber, String email, String phone, String password, String salt, int number_department) {
        super(name, surname, number);
        this.serie = serie;
        this.passnumber = passnumber;
        this.email = email;
        this.phone = phone;
        this.password = password;
        this.salt = salt;
        this.number_department = number_department;
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
