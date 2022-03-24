package second;

public class Dzz0 {
    public static void main(String args[]) {
        System.out.println( 5. / 2);// int / int = int; double / int  int / double double / double = double
        sum(0, 3);
        next(10, 13);
        printNumbers(-10);
        task8(15);
    }
    public static int sum(int i, int x) {
        int summa = 0;
        for (int a = i; a <= x; a++) {
            summa += a;
        }
        System.out.println(summa);
        return summa;
    }
    public static void next(int i, int x) {
        int summa = sum(i, x);
        if (summa % 3 == 0) {
            summa = summa * summa;
            System.out.println(summa);
        } else if (x % 3 != 0) {
            summa = summa * summa * summa;
            System.out.println(summa);
        }
    }
    public static void printNumbers(int x) {
        int i = 0;
        while (i < x) {
                i+=1;
                System.out.print(i + " ");
            }
        i=0;
        while (i>x){
            x+=1;
            System.out.print(x-1+" ");
        }
    }

    public static void task8(int k){
        System.out.println();
        double sum = 0;
        int n = 1;
        for (int i = 1; i < k; i++) {
            sum += 1. / n;
            n *= i;
        }
        System.out.println(sum);
    }
}
