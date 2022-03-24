package clas;

import java.util.Scanner;

public class Clas2 {
    public static void main(String[] args) {
        int [] ac = {-5,-7,-9};
        int max= ac[0];
        for (int i = 1; i < ac.length; i++){
            if(ac[i] > max ){
                max =ac[i];
            }
        }
        System.out.println(max);

    }
}
