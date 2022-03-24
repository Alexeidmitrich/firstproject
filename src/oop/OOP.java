package oop;

import java.util.Scanner;

public class OOP {
    public static void main(String[] args) {
        Scanner  in=new Scanner(System.in);
        System.out.println("ведите длину первой стороны прямоугольника ");
        int a=in.nextInt();
        System.out.println("Введите длину второй стороны прямоугольника ");
        int b= in.nextInt();
        OOP2 oop2=new OOP2(a,b);
        System.out.println(oop2.Figura());
        System.out.println(oop2.Figura1());
    }
}
