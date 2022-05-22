package bank;

public class BankDepartment {

    private int id;
    private String city;

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
}
