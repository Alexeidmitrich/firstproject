package firstpackage;

public class DemoArray {

    public static void main(String[] args) {
        int a []= {5,6,7};
        String a2[] = {"hello", "+2"};
        String s= "Hello";
        System.out.println(s.toUpperCase());
        int a3[] = new int[4];
        a3[1] = 45;
        //for (int i = 0; i < a3.length; i++) {
       //     System.out.println(i + " " + a3[i]);
      //  }
        String a4[] = new String[2];
        a4[0] = "Vasja";
        a4[1] = "Petja";
        for (int i = 0; i < a4.length; i++) {
            System.out.println(a4[i].toUpperCase());
        }

        int [][] array = new int[4][3];
       // int [][][][][] ar = new  int[2][15][3][85][3]
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j]+ " ");
            }
            System.out.println();
        }
        char c [][] ={ {'X', 'O', 'O'}, {'X', 'O', 'O'}, {'X', 'O', 'O'}};
        for (int i = 0; i < c.length; i++) {
            for (int j = 0; j < c[i].length; j++) {
                System.out.print(c[i][j] + " | ");
            }
            System.out.println();
            System.out.println("---+----+-----");
        }
    }
}
