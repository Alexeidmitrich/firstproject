package dz;

public class DZ2 {
    int c;
    char d;
    int e;

    public DZ2(int a, char n, int b) {
        c = a;
        d = n;
        e = b;
    }
    public int Kalk() {
        if (d == '+') {
            return c + e;
        } else if (d == '-') {
            return c - e;
        } else if (d == '*') {
            return c * e;
        } else if (d == '/') {
            return c / e;
        }
        return 0;
    }
}


