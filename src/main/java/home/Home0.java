package home;

import java.util.Random;

public class Home0 {
    public static void main(String[] args) {
        Random random=new Random();
        int[] arr=new int[12];
        int i=0;
        while (i< arr.length){
            arr[i]= random.nextInt(10-(-10)+1)+(-10);
            i++;
        }System.out.println();
        Home1 more=new Home1(arr);
        System.out.print(more.More());
        }
    }

