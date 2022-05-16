package training;

import java.util.Random;
import java.util.Scanner;
public class New
{public static int ModulLeft(int a, int[] arr){
    int sumLeft=0;
    int sumRight=0;
    int i=0;
    while(i<(arr.length/2)){
        sumLeft+=Math.abs(arr[i]);
        i++;
    }
    i=arr.length/2;
    while(i<arr.length){
        sumRight+=Math.abs(arr[i]);
        i++;
    }
    System.out.println();
    if(sumLeft>sumRight){
        System.out.println("Сумма модулей левой половины больше ");
        return sumLeft;
    }
    else if(sumLeft<sumRight){
        System.out.println("Сумма модулей правой половины больше ");
        return sumRight;
    }
    else if(sumLeft==sumRight){
        System.out.println("Суммы модулей равны ");
    }
    return 0;
}
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Random random = new Random();
        System.out.println("Введите четное, положительное число");
        int a = in.nextInt();
        while(a%2!=0||a<0) {
            System.out.println("Введите число ещё раз");
            a = in.nextInt();
        }
        int[] arr = new int[a];
        int i=0;
        while (i< arr.length){
            arr[i] = random.nextInt(5 - (-5) + 1) + (-5);
            System.out.print(arr[i] + " ");
            i++;
        }
        System.out.println();
        System.out.println(ModulLeft(a,arr));
    }
}
