package dz;

public class DZ4 {
    int b;
    public DZ4(int a){
        b=a;
    }public float Sum(){
        if(b<=100){
            float sum1=b+(b*0.05f);
            return sum1;
        }else if(b>100||b==200){
            float sum2=b+(b*0.07f);
            return sum2;
        }else if(b>200){
            float sum3=b+(b*0.1f);
        }
            return 0;
        }
    }

