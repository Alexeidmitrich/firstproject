package dz;

import java.util.Scanner;

public class DZ7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Игрок один делает выбор -Камень, Ножницы, Бумага ");
        String a= in.nextLine();
        System.out.println("Игрок два делает выбор -Камень, Ножницы, Бумага ");
        String b= in.nextLine();
        DZ8 Lottery=new DZ8(a,b);
        System.out.println(Lottery.Vibor());
    }
}
