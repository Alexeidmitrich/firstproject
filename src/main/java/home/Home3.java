package home;

public class Home3 {
    int a[];
    int b[];
    double c[];
    public Home3(int[] arr,int[] arr1, double[] arr2){
        a=arr;
        b=arr1;
        c=arr2;
    } public int Num(){
        int d=0;
        for(int i=0; i<a.length; i++){
            if(c[i]%1==0){
              d++;
            }
        }
        return d;
    }
}
