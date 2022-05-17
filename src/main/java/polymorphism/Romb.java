package polymorphism;

public class Romb extends  Shape{
    @Override
    public void perimetr() {

    }

    @Override
    public void area() {

    }
}

class A {

    public void  method() {
        System.out.println("!");
    }
}

class B{

    public void method(){
        System.out.println("R");
    }






}
interface F {
    void  x();
}
interface G{
    void x();
}
class C extends B  implements F, G{

    @Override
    public void x() {

    }
}