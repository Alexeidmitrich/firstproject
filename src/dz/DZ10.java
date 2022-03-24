package dz;

public class DZ10 {
    float d;
    float e;
    float f;
 public DZ10 (float prob, float prize, float pay){
     d=prob;
     e=prize;
     f=pay;
 }   public String profitableGamble(){
     if(((d*e)-f)>0){
         return "true";
     }else if(((d*e)-f)<0){
        return "false";
     }else {
         return "";
     }
    }
}
