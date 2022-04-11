package bank;

public abstract class Person {
    private int number;
    private String name;
    private String family;

    public Person(String name, String family, int number) {
        this.name = name;
        this.family = family;
        this.number = number;

    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFamily() {
        return family;
    }

    public void setFamily(String family) {
        this.family = family;
    }
}
