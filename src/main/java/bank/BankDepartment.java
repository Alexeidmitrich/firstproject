package bank;

import javax.persistence.*;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@Entity
@Table(name = "bank")
@XmlRootElement
public class BankDepartment {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "bankid")
    @XmlElement
    private int id;
    @XmlElement
    private String city;


    //@OneToMany(fetch = FetchType.LAZY, mappedBy = "bankDepartment")
    //@Transient
//    private List<Client> clientsList = new ArrayList<>();

   // @OneToMany(fetch = FetchType.LAZY, mappedBy = "bankDepartment")
  //  private List<Employee> employeeList = new ArrayList<>();
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

   @Override
    public String toString() {
        return "BankDepartment{" +
                "id=" + id +
                ", city='" + city + '\'' +
                '}';
    }

}
