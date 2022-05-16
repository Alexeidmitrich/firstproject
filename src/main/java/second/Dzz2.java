package second;

import java.util.Random;

public class Dzz2 {
    public static void main(String[] args) {
        int[] ar = {2, 3, 8, 10, 16, 18};
        int[] b  = {1,11,12};
        //sum(ar);
        //index(ar);
        //maxElement(ar);
       //prosto(ar);
        // erat(10);
        massiv(ar, b);
    }

    public static void massiv(int a[], int b[]){
        int [] array = new int[a.length+b.length];
        int i = 0, j = 0, k = 0;
        while (i < a.length && j < b.length){
            if(a[i]>b[j]){
                array[k] = b[j];
                j++;
                k++;
            }else {
                array[k]=a[i];
                i++;
                k++;
            }
        }
        while (i < a.length){
            array[k] = a[i];
            k++;
            i++;
        }
        while (j < b.length){
            array[k] = b[j];
            k++;
            j++;
            }

        for (int l = 0; l < array.length; l++) {
            System.out.print(array[l] + "  ");
        }
        System.out.println();
    }
    public static void sum(int ar[]) {
        int summa = 0;
        for (int i = 0; i < ar.length; i++) {
            if (ar[i] % 2 == 0) {
                summa += ar[i];
            }
        }
        System.out.print(summa + " ");
    }

    public static void index(int arr[]) {
        System.out.println();
        int bill = 0;
        for (int i = 0; i < arr.length; i++) {
            if (i % 2 == 0) {
                bill += arr[i];
            }
        }
        System.out.print(bill + " ");
    }

    public static void maxElement(int[] array) {
        System.out.println();
        int max1 = array[0];

        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max1) {
                max1 = array[i];
            }
            if(array[i] < min){
                min = array[i];
            }
           // System.out.print(max1 + " "); // 4 5 7 -4 6
        }
        int max2 = min;

        for (int i = 0; i < array.length ; i++) {
            if (array[i] > max2 && array[i] < max1 ){
                max2 = array[i];
            }
        }
        System.out.println("Max1 " + max1 + ", max2 " + max2);
    }


        public static void prosto(int a[]){
            System.out.println();
            boolean isFound = false;
            for (int i = 0; i < a.length;i++){// 4 3 5 9
                System.out.println(a[i]);
                for (int j = 2; j < a[i]; j++) {
                    if (a[i] % j == 0){
                        break;
                    }
                    isFound =true;
                }
            }
            if (isFound){
                System.out.println("Yes");
            } else{
                System.out.println("No");
            }
        }
        public static void erat(int n){
            System.out.println();
            boolean[] primeArray = new boolean[n];
            primeArray[0] = true;
            primeArray[1] = true;
            for (int i = 2; i < primeArray.length; i++) {
                if (!primeArray[i]) {
                    for (int j = 2 * i; j < primeArray.length; j += i) {
                        primeArray[j] = true;
                    }
                }
            }

            for (int i=0;i<primeArray.length;i++) {
                if (!primeArray[i]) {
                    System.out.println(i+" is prime");
                }
            }
        }
    }


