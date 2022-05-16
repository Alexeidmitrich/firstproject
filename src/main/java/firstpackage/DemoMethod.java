package firstpackage;

public class DemoMethod {

    public static void main(String[] args) {
        hello();
        hello();
        hello("Masha");
        hello("John");
        max(5 ,  8);
        max(8,25);
        int a[]= {4,5,7};
        max(a);
        int b[] = {87,-98,65,-4,1,87,-906};
        max(b);

        findElement(b, -906);
        sum(a);
    }

    public static void sum(int a[]){
       int summa=0;
       for(int i=0; i<a.length; i++){
           summa+=a[i];
       }

        System.out.print(summa);
    }
    public static void findElement(int a[], int element){
        boolean isFound =false;
       for (int i=0; i<a.length; i++){
           if(a[i]==element){
               isFound = true;
               System.out.println("Yes "  + element);
               break;
           }
       }
       if(isFound == false){
           System.out.println("No");
       }
    }
    public static void hello(){
        System.out.println("Hello!");
    }

    public static void hello(String name){
        System.out.println("Hello " + name);
    }

    public static void max(int a, int b){
        System.out.println("Алгоритм ищет максимально число среди " + a + ", " + b);
        if(a>b){
            System.out.println(a);
        }else {
            System.out.println(b);
        }
    }

    public static void max(int []a){

        int max= a[0];
        for (int i = 1; i < a.length; i++){
            if(a[i] > max ){
                max =a[i];
            }
        }
        System.out.println(max);
    }
}
