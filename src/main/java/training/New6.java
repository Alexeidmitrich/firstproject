package training;

import java.util.Random;
import java.util.Scanner;

public class New6 {
    static Random random=new Random();
    static Scanner in=new Scanner(System.in);
    public static int index_first_negative(int arr[]){
        int index=0;
        int i=0;
        while(i< arr.length){
            if(arr[i]%2!=0){
                index=i;
                break;
            }
            i++;
        }
        return index;
    }public static int index_last_negative(int arr[]){
        int index1=0;
        int i=0;
        while (i< arr.length){
            if (arr[i]%2!=0) {
              index1=i;
            }
            i++;
        }
        return index1;
    }public static int sum_between_negative(int arr[]){
        int sum=0;
        for (int i=(index_first_negative(arr)); i<(index_last_negative(arr)); i++){
            sum+=Math.abs(arr[i]);
        }
        return sum;
    } public static int sum_before_and_after_negative(int arr[]){
        int sum1=0;
        int sum2=0;
        for(int i=0; i<(index_first_negative(arr)); i++){
            sum1+=Math.abs(arr[i]);
        }for (int i=(index_last_negative(arr)); i< arr.length; i++){
            sum2+=Math.abs(arr[i]);
        }
        return sum1+sum2;
    }
    public static void main(String[] args) {
    int [] arr= new int[16];
    int i=0;
    while (i< arr.length){
        arr[i]= random.nextInt(20-(-7)+1)+(-7);
        System.out.print(arr[i]+" ");
        i++;
    }
}
}
