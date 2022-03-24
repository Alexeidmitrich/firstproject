package dz;

import java.util.Scanner;

public class DZ3 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Введите сумму вклада ");
        int a= in.nextInt();
        DZ4 summ=new DZ4(a);
        System.out.println(summ.Sum());
    }
}
