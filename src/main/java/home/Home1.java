package home;

public class Home1 {
    int a[];

    public Home1(int[] arr) {
        a = arr;
    }

    public int[] More() {
        int b = 0;
        int c = 0;
        int i = 0;
        do {
            while (i < a.length) {
                if (a[i] > 0) {
                    b++;
                } else if (a[i] < 0) {
                    c++;
                }
                if (a[i] == 0) {
                    --i;
                }
                if (i == a.length - 1 && b != a.length / 2) {
                    b = 0;
                    c = 0;
                }
                i++;
            }
        }
        while (b != a.length / 2 && c != a.length / 2);
        i = 0;
        while (i < a.length) {
            System.out.print(a[i]+" ");
            i++;
        }
        System.out.println();
        return a;
    }
}


