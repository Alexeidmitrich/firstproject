package training;

import java.util.Scanner;

public class New3 {
    static Scanner in=new Scanner(System.in);
  public static int getInt (){
      System.out.println("Введите число");
      int a=in.nextInt();
      return a;
  }
  public static char getOperation(){
      System.out.println("Выбирите действие");
      char g=in.next().charAt(0);
      return g;
  }
  public static int Calk(int b, int c, char h ){
   int k=0;
   if (h=='+'){
       k=b+c;
   }else if(h=='-'){
       k=b-c;
   }else if(h=='/'){
       k=b/c;
   }else if(h=='*'){
       k=b*c;
   }
   return k;
  }
  public static void main(String[] args) {
int b=getInt();
int c=getInt();
char h=getOperation();
int l=Calk(b,c,h);
      System.out.println(l+" ");
    }
}
