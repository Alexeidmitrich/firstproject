package extensions;

public class A {

    protected   int x;

    public A(int x) {
        this.x = x;
    }
    public  A(){
    }

    public final void print(){
        System.out.println(x);
    }

    public static void main(String[] args) {
        A a = new B(5);
        a.print();

    }
}

final class  B extends A {

    public B(int x) {
        super(x);
    }



    public void someAnotheMethod(){
        System.out.println("==========");
        System.out.println(x + "!");
        System.out.println("=======");
    }

    public void ttttt(){

    }
}

