package bookshop;

import java.util.Scanner;

public class CommandTool {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Title");
        String title  = sc.nextLine();
        System.out.println("Address");
        String address = sc.nextLine();
        System.out.println("Director's firstname");
        String firstname = sc.nextLine();
        System.out.println("Director's lastname");
        String lastName = sc.nextLine();
        Director director = new Director(firstname, lastName);
        director.printInformation();
        Bookshop bookshop = new Bookshop(director);
    }
}