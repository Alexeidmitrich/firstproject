package oop;

import java.util.Scanner;

public class OOP4 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Введите 3-х очковый броски ");
        int a=in.nextInt();
        System.out.println("Введите 2-х очковые броски ");
        int b= in.nextInt();
        OOP3 basket=new OOP3(a,b);
        System.out.println(basket.Basket());
    }
}
