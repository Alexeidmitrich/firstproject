package bank;

import java.util.Scanner;

public class CommandTool {

    public static void main(String[] args) {
        Scanner sc  =new Scanner(System.in);
        System.out.println("Title");
        String title  = sc.nextLine();
        System.out.println("Address");
        String address = sc.nextLine();
        System.out.println("Director's firstname");
        String firstname = sc.nextLine();
        System.out.println("Director's lastname");
        String lastName = sc.nextLine();
        System.out.println("Diirector's salary");
        int salary = sc.nextInt();
        Director director = new Director(firstname, lastName, salary);
        director.printInformation();
        Bank bank  = new Bank(title, address, director);
        bank.info();
    }
}
