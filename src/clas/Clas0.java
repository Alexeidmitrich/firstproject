package clas;

import java.util.Random;

public class Clas0 {
    public static void main(String[] args) {
        Random random=new Random();
        int[] arr=new int[11];
        int i=0;
        while (i< arr.length){
            arr[i]= random.nextInt(1-(-1)+1)+(-1);
            System.out.print(arr[i]+" ");
            i++;
        }
        System.out.println();
        Clas1 data=new Clas1(arr);
        System.out.println(data.More());
    }
}
