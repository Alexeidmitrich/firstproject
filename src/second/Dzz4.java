package second;

import java.util.Arrays;

public class Dzz4 {
    public static void main(String[] args) {
        int a[] = {5, 6, -1, 7};
        //
        arrayShift(a, -1);
        /*int [] b = {5, 7};
        System.out.println(Arrays.toString(b));
        int temp = b[0];
        b[0] = b[b.length - 1];
        b[b.length-1]=temp;

        System.out.println(Arrays.toString(b));

         */

    }

    public static void arrayShift(int a[], int shift) {
        for (int j = 0;  j < shift; j++ ) {
            int temp = a[a.length - 1];
            for (int i = a.length - 2; i >= 0; i--) {
                a[i + 1] = a[i];
            }
            a[0] = temp;
        }
        for (int j = shift;  j < 0; j++ ) {
            int temp = a[0];
            for (int i = 1; i < a.length; i++) {
                a[i - 1] = a[i];
            }
            a[a.length-1] = temp;
        }
        System.out.println(Arrays.toString(a));
    }

}
