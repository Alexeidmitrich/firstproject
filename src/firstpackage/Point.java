package firstpackage;

public class Point {

    int x;
    int y;

    public void info(){
        System.out.println(x + " "+ y);
    }


    public static void main(String[] args) {
        Point p = new Point();
        p.x = 5;
        p.y = 7;
        p.info();

        Point g = new Point();
        g.x = 3;
        g.y = 2;
        g.info();

        int[] a = {5, 6 ,7};
        Point[] array ={p, g};
        for (int i = 0; i < array.length; i++) {
            array[i].info();
        }
        for (int i = 0; i < a.length; i++) {

        }


    }
}
