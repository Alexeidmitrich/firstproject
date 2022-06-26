package bank;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Transient;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "clients")
public class Client extends Person{
    @Column(nullable = false, length = 10)

    protected int serie;
    @Column(nullable = false, length = 15)
    protected String passnumber;
    @Column(nullable = false, length = 35)
    protected String email;
    @Column(nullable = false, length = 12)
    protected String phone;
    @Column(nullable = false, length = 500)
    protected String password;
    @Column(nullable = false, length = 200)
    protected String salt;
    //@Column(name="number_department")
    @Transient
    protected BankDepartment bankDepartment;
    @Transient
    List<Account> accountList = new ArrayList<>();
    @Transient
    List<Credit> creditList = new ArrayList<>();

    public Client() {

    }

    public Client(int number,String firstname,String lastname, int serie, String passnumber, String email, String phone, String password, String salt, int numberDepartment) {
        super(number, firstname, lastname);
        this.serie = serie;
        this.passnumber = passnumber;
        this.email = email;
        this.phone = phone;
        this.password = password;
        this.salt = salt;
       // this.numberDepartment = numberDepartment;//TODO fix
    }
    public Client(String firstname,String lastname, int serie, String passnumber, String email, String phone, String password, String salt, int numberDepartment){
        super(firstname, lastname);
        this.serie = serie;
        this.passnumber = passnumber;
        this.email = email;
        this.phone = phone;
        this.password = password;
        this.salt = salt;
       // this.numberDepartment = numberDepartment;//TODO fix
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

    public String getPassnumber() {
        return passnumber;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }

    public String getPassword() {
        return password;
    }

    public String getSalt() {
        return salt;
    }

    public BankDepartment getBankDepartment() {
        return bankDepartment;
    }

    public void printClient(){
        System.out.println(getFirstname() + " " + getLastname() + " " + getSerie() + " " + getPassnumber() + " " + getEmail() + " " + getPhone() + " " + getPassword() + " " + getSalt() + " " + getBankDepartment());
    }
}
