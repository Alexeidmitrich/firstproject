package training;

import java.util.Arrays;
import java.util.Random;

public class New4 {
    static Random random=new Random();
  public static int randomInt(){
      int g=random.nextInt(15-(-15)+1)+(-15);
      return g;
  }
    public static void main(String[] args) {
     int[] arr=new int[12];
     int i=0;
     while (i< arr.length){
         arr[i]=randomInt();
         i++;
     }
        System.out.println(Arrays.toString(arr));
    }
}
