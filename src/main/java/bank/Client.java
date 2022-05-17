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
    protected int numberDepartment;
    List<Account> accountList = new ArrayList<>();
    List<Credit> creditList = new ArrayList<>();

    public Client(int number, String name, String surname, int serie, String passnumber, String email, String phone, String password, String salt, int numberDepartment) {
        super(name, surname, number);
        this.serie = serie;
        this.passnumber = passnumber;
        this.email = email;
        this.phone = phone;
        this.password = password;
        this.salt = salt;
        this.numberDepartment = numberDepartment;
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

    public int getSerie() {
        return serie;
    }

    public void setSerie(int serie) {
        this.serie = serie;
    }

    public String getPassnumber() {
        return passnumber;
    }

    public void setPassnumber(String passnumber) {
        this.passnumber = passnumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getSalt() {
        return salt;
    }

    public void setSalt(String salt) {
        this.salt = salt;
    }

    public int getNumberDepartment() {
        return numberDepartment;
    }

    public void setNumberDepartment(int numberDepartment) {
        this.numberDepartment = numberDepartment;
    }

    public List<Account> getAccountList() {
        return accountList;
    }

    public void setAccountList(List<Account> accountList) {
        this.accountList = accountList;
    }

    public List<Credit> getCreditList() {
        return creditList;
    }

    public void setCreditList(List<Credit> creditList) {
        this.creditList = creditList;
    }
}
