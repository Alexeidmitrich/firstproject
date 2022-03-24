package newes;

import java.util.Random;
import java.util.Scanner;

public class New8 {
    static Random random=new Random();
    static Scanner in=new Scanner(System.in);
    public static int index_first_zero(int arr[]){
        int index=0;
        int i=0;
        while (i< arr.length){
            if(arr[i]==0){
                index=i;
                break;
            }
            i++;
        }
        return index;
    } public static int index_last_zero(int arr[]){
        int index1=0;
        int i=0;
        while (i< arr.length){
            if (arr[i]==0){
                index1=i;
            }
            i++;
        }
        return index1;
    } public static int sum_between_zero(int arr[]){
        int sum=0;
        for (int i=(index_first_zero(arr)+1); i<=(index_last_zero(arr)); ++i){
            sum+=Math.abs(arr[i]);
        }
        return sum;
    }public static int sum_before_and_after_zero(int arr[]){
        int sum1=0;
        for(int i=(index_first_zero(arr)); i<(index_last_zero(arr)); i++){
            sum1+=Math.abs(arr[i]);
        }
        return sum1;
    }
    public static void main(String[] args) {
        int[] arr=new int[15];
        int i=0;
        while (i< arr.length){
            arr[i]= random.nextInt(15-(-15)+1)+(-15);
            System.out.print(arr[i]+" ");
            i++;
        }
        System.out.println();
        System.out.println("Введите действие, выбрав: 0, 1, 2, 3");
        int a=in.nextInt();
        if(a==0){
            System.out.println(index_first_zero(arr));
        } else if(a==1){
            System.out.println(index_last_zero(arr));
        }else if(a==2){
            System.out.println(sum_between_zero(arr));
        }else if (a==3){
            System.out.println(sum_before_and_after_zero(arr));
        }
    }
}
