package dz;

import java.util.Scanner;

public class DZ1 extends DZ2{

    public DZ1(int a, char n, int b) {
        super(a, n, b);
    }

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Введите первое число ");
        int a=in.nextInt();
        System.out.println("Выбирите арифметическое действие ");
        char n=in.next().charAt(0);
        System.out.println("Введите второе число ");
        int b= in.nextInt();
        DZ2 kalk=new DZ2(a,n,b);
        System.out.println(kalk.Kalk());
    }
}
