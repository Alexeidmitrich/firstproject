package newes;

import java.util.Random;
import java.util.Scanner;

public class New2 {



    public static String more(int[] arr) {
        int a = 0;
        int b = 0;
        int c = 0;
        int i = 0;
        while (i < arr.length) {
            if (arr[i] == 1) {
                a++;
            } else if (arr[i] == -1) {
                b++;
            } else if (arr[i] == 0) {
                c++;
            }
            i++;
        }
        if (a > b && a > c) {
            return "В массиве больше 1";
        } else if (b > a && b > c) {
            return "В массиве больше -1";
        } else if (c > a && c > b){
            return "В массиве больше 0";
        } else {
            return "нет доминирующего значения";
        }
    }

    public static void main(String[] args) {
        Random  random=new Random();
        Scanner in=new Scanner(System.in);
        int [] arr=new int[11];
        int i=0;
        while(i< arr.length){
            arr[i] = random.nextInt(1-(-1)+1)+(-1);
            System.out.print(arr[i]+"");
            i++;
        }
        System.out.println();
        System.out.println(more(arr));
    }
}
