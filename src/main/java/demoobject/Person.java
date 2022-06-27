package demoobject;

import java.util.*;

public class Person {

    private String name;
    private int number;

    public Person(String name, int number) {
        this.name = name;
        this.number = number;
    }

    @Override
    public String toString() {
        return "Name :" + name + ", number " + number;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return number == person.number && Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, number);
    }

    public void method() {

    }
    public static void main(String[] args) {
        //Контракт:
        /*
        Если объекты равны то у них обязан быть одинаковый хэш код. Если у двух объектов одинаковый хэш код, то это
        ещё не значит что объекты равны
         */
        int x = 5;
        double y = 7;
        int h = (int)y;
        //Type reference = new Object()
        Person person = new Person("A", 1);
        Person person1 = new Person("A", 1);
        Person p3 = person;
        System.out.println(person.equals(person1));
        Set<Person> personSet = new HashSet<>();
        personSet.add(person);
        personSet.add(person1);
        System.out.println(personSet);
        //p3.clone();
        Object p4 = new Person("K", 4);
        Person p5 = (Person) p4;
        //System.out.println(person == p3);
        //System.out.println(5 ==  5);

        Set<Integer> set = new HashSet<>();
        set.add(1);
        set.add(1);
        set.add(5);
        set.add(6);
        set.add(5);
        System.out.println(set);
        List<Integer> list = new ArrayList<>();
        Object u = list;
        if (u instanceof Person) {
            Person p8 = (Person) u;
        }
    }
}
