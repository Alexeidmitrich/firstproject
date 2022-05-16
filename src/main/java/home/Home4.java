package home;

public class Home4 {

    public static void main(String[] args) {
        abs(10);
        whatIsANumber(-10);
        square(4);
        method1(10, 14);
    }

    public static void abs(int x) {
        if (x >= 0) {
            System.out.println(x);
        } else {
            x = x * (-1);
            System.out.println(x);
        }
    }

    public static void whatIsANumber(int x) {
        if (x < 0) {
            System.out.println("Отрицательное число ");
        } else if (x > 0) {
            System.out.println("Положительное число ");
        } else {
            System.out.println("b=0");
        }
    }

    public static void square(double radius) {
        double S;
        S = Math.PI * Math.pow(radius,2);
        System.out.println("Площадь круга " + S);

    }

    public static void method1(int a, int b) {
        if ((a - b) > 0) {
            System.out.println(a - b > 0);
        } else {
            System.out.println(a - b < 0);
        }
    }
}

