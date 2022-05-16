package dz;

import java.util.Scanner;

public class DZ5 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Введите первое число ");
        int a=in.nextInt();
        System.out.println("Введите второе число ");
        int b=in.nextInt();
        System.out.println("Введите третье число ");
        int c= in.nextInt();
        DZ6 summ=new DZ6(a,b,c);
        System.out.println(summ.Sum());
        System.out.println(summ.Sum2());
        System.out.println("Среднеарифмитическое " +summ.Sum1());
    }
}
