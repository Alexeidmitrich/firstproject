package oop;

import java.util.Scanner;

public class OOP7 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Введите число ");
        int a= in.nextInt();
        OOP8 pravda=new OOP8(a);
        System.out.println(pravda.Delete());
    }
}
