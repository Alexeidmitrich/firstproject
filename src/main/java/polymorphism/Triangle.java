package polymorphism;

public class Triangle extends Shape{
    @Override
    public void perimetr() {
        System.out.println("Perimetr of triangle");
    }

    @Override
    public void area() {
        System.out.println("Area of triangle");
    }
}
