package firstpackage;

public class DataType {

    public static void main(String[] args) {
        //1  0
        //11101
        // 11111111 + 255
        //byte  -128  127
        int max = Integer.MAX_VALUE;
      //  System.out.println(max  + 1);
        int min = Integer.MIN_VALUE - 1;
     //   System.out.println(min);
      //  System.out.println( 0.1 + 0.2);
        //double x =1.3;
        //switch ((int)(x * 10)) {
        //    case 13:
        //}
        char x = 'C';
        int y = x;
        //System.out.println(y);
        y = y+1;
        char k = (char) y;
       // System.out.println(k);
        String str = "AMX"; //BNY
        for (int i = 0; i <str.length() ; i++) {
            char b = str.charAt(i);
                if (b == 'A') {
                    int temp = b + 1;
                    char a = (char) temp;
                    System.out.println(a);
                }
                else if (b == 'M') {
                    int temp = b + 10;
                    char a = (char) temp;
                    System.out.println(a);
                }
                else if (b == 'X') {
                    int temp = b + 2;
                    char a = (char) temp;
                    System.out.println(a);
                }
            }
        }
    }
