package home;

import java.util.Arrays;
import java.util.Random;

public class Home2 {
    public static void main(String[] args) {
        Random random=new Random();
        int [] arr=new int[10];
        int[] arr1=new int[10];
        double[] arr2=new double[10];
        for (int i=0;i< arr.length; i++){
            arr[i]= random.nextInt(9-(1)+1)+(1);
            System.out.print(arr[i]+" ");
        }System.out.println();
        for (int i=0;i< arr.length; i++){
            arr1[i]= random.nextInt(9-(1)+1)+(1);
            System.out.print(arr1[i]+" ");
        }
        System.out.println();
        for (int i=0;i< arr.length; i++){
            arr2[i]=(double)arr[i]/arr1[i];
            System.out.print(arr2[i]+" ");
        }
        System.out.println();
        Home3 numb=new Home3(arr, arr1, arr2);
        System.out.println("Количество целых элементов в третьем массиве: " +numb.Num());

    }
}
