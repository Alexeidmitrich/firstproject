package second;

import java.util.Arrays;

public class Dzz3 {

    public static void main(String[] args) {
        int[][] a = {{1, 4}, {6, 9}};
        int[][] b = {{3, 0}, {7, 1}};
        summMass(a,b);
    }

    public static void summMass(int[][] a, int[][] b) {
        int [][] sum = new int[a.length] [a[0].length];;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++)
                sum[i][j]=a[i][j]+b[i][j];
        }
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++){
                System.out.print(sum[i][j] + "   ");
            }
            System.out.println();
        }
    }
}

