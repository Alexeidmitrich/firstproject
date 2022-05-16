package clas;

public class Clas1 {
    int a[];
    public Clas1(int[] arr){
        a=arr;
    }public String More(){
        int i=0;
        int b=0;
        int c=0;
        int d=0;
        while (i<a.length){
           if(a[i]==1){
               b++;
           }else if(a[i]==-1){
               c++;
           }else if(a[i]==0){
               d++;
           }
           i++;
        }
       if(b>c&&b>d){
           return "В массиве больше 1";
       }else if(c>b&&c>d){
           return "В массиве больше -1";
       }else if(d>b&&d>c){
           return "В массиве больше 0";
       }else {
           return "";
       }
    }
}
