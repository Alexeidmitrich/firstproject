package dz;

public class DZ6 {
    int d;
    int f;
    int g;

    public DZ6(int a, int b, int c) {
        d = a;
        f = b;
        g = c;
    }

    public String Sum() {
        if (d > f && d > g) {
            return "Больше первое число ";
        } else if (f > d && f > g) {
            return "Больше второе число ";
        } else if (g > d && g > f) {
            return "Больше третье число";
        } else if (d == f || d == g || f == g) {
            return "Ошибка";
        }
        return "";
    }

    public float Sum1() {
        float sumSrednee = (d + f + g) / 3f;
        return sumSrednee;
    }

    public String Sum2() {
        if (d < f && d < g) {
            return "Меньше первое число ";
        } else if (f < d && f < g) {
            return "Меньше второе число ";
        } else if (g < d && g < f) {
            return "Меньше третье число";
        } else if (d == f || d == g || f == g) {
            return "Ошибка";
        }
        return "";
    }
}
