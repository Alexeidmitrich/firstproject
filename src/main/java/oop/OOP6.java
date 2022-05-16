package oop;

import java.util.Scanner;

public class OOP6 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Введите вес ");
        int a=in.nextInt();
        OOP5 moon1=new OOP5(a);
        System.out.println(moon1.Weight());
    }
}
