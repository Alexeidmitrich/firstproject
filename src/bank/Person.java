package bank;

public abstract class Person {

    private String name;
    private String family;
    private int number;

    public Person(String name, String family, int number) {
        this.name = name;
        this.family = family;
        this.number = number;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setFamily(String family) {
        this.family = family;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public String getFamily() {
        return family;
    }

    public int getNumber() {
        return number;
    }
}
