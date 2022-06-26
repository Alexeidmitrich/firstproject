package bank;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "bank")
public class BankDepartment {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "bankid")
    private int id;
    private String city;
    //@OneToMany(fetch = FetchType.LAZY, mappedBy = "bankDepartment")
    @Transient
    private List<Client> clientsList = new ArrayList<>();

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "bankDepartment")
    private List<Employee> employeeList = new ArrayList<>();
    public BankDepartment() {
    }

    public BankDepartment(String city) {
        this.city = city;
    }

    public BankDepartment(int id, String city) {
        this.id = id;
        this.city = city;
    }

    public int getId() {
        return id;
    }

    public String getCity() {
        return city;
    }

    public  void print(){
        System.out.println(id + " " + city);
    }
}
