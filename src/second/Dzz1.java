package second;

public class Dzz1 {
    public static void main(String[] args) {
        sumNumber(-3, 3);
        found(12);
        koren(2);
        gcd(46,23);
        stepen(4, 3);
        mark(4.0);
    }

    public static void sumNumber(int i, int x) {
        int summa = 0;
        for (int a=i; a<=x; a++){
            summa += Math.abs(a);
        }
            System.out.print(summa + " ");
    }
        public static void found(int a) {
            System.out.println();
            int i;
            int b;
            String result="";
            while(a !=0 ) {
                b = a%2;
                result = b + result;
                a = a/2;
            }
            System.out.println(result);
        }
    public static void koren(int n){
        double result = Math.sqrt(2);
        for (int i = 0; i <= n; i++) {
            result = Math.sqrt( 2 + result);
        }
        System.out.println(result);
    }

    public static void gcd(int a, int b){
        int r = 0;
        int result;
        do {
          r =   a % b;
          a = b;
          result = b;
          b = r;
        }while (r != 0);
        System.out.println("GCD " + result);
    }

    public static void stepen(int x, int n){
       int result=1;
       for (int i=1; i<=n; i++) {
           result = result * x;
       }
           System.out.println(result);
       }
       public static void mark(double x){
            if(x==5.0){
                System.out.println("0-19.5 ");
            }else if(x==4.0){
                System.out.println("20-21.5 ");
            }else if(x==3.7){
                System.out.println("22-23.5 ");
            }else if(x==3.3){
                System.out.println("24-25.5");
            }else if (x==3.0){
                System.out.println("26-27.5 ");
            }else if(x==2.7){
                System.out.println("28-29.5 ");
            }else if(x==2.3){
                System.out.println("30-31.5 ");
            }else if(x==2.0){
                System.out.println("32-33.5 ");
            }else if(x==1.7){
                System.out.println("34-35.5 ");
            }else if(x==1.3){
                System.out.println("36-37.5 ");
            }else if(x==1.0){
                System.out.println("38-40 ");
            }
       }
    }



