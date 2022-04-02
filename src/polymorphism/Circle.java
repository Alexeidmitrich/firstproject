package polymorphism;

public class Circle extends Shape{
    @Override
    public void perimetr() {
        System.out.println("Perimetr of circle");
    }

    @Override
    public void area() {
        System.out.println("Area of circle");
    }
}
