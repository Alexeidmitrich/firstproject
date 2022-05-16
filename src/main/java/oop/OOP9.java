package oop;

import java.util.Random;

public class OOP9 {
    public static void main(String[] args) {
        Random random=new Random();
        int[] arr=new int[10];
        int i=0;
        while (i<arr.length){
           arr[i]= random.nextInt(15-(-1)+1)+(-1);
            System.out.print(arr[i]+" ");
            i++;
        }
        System.out.println();
        OOP10 boom=new OOP10(arr);
        System.out.println(boom.Boom());
    }
}
