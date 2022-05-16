package training;

public class DemoCodeExceptionOne {

    public static double div(int a[], int b) {
        double sum = 0;
        if (b != 0) {
            for (int i = 0; i < a.length; i++)
                sum += a[i] / b;
        }
        return sum;
    }

    public static void main(String[] args) {
        int a [] = {3, 4, 6, -1};
        System.out.println(div(a, 2));
        System.out.println(div(a, 0));
    }
}

