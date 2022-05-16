package oop;

public class OOP8 {
    int b;
    public OOP8(int a){
        b=a;
    }public String Delete(){
        if(b%5==0){
           return "true";
        }else if(b%5!=0){
            return "false";
        }
        else{
            return "";
        }
    }
}
