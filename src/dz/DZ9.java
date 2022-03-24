package dz;

import java.util.Scanner;

public class DZ9 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Введите первый аргумент ");
        float prob=in.nextFloat();
        System.out.println("Введите второй аргумент ");
        float prize= in.nextFloat();
        System.out.println("Введите третий аргумент");
        float pay=in.nextFloat();
        DZ10 sravn=new DZ10(prob,prize,pay);
        System.out.println(sravn.profitableGamble());

}
}
