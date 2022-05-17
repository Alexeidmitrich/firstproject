package polymorphism;

public class Reactangle extends Shape  implements  Draw, Print{
    @Override
    public void perimetr() {
        System.out.println("Perimetr of rectangle");
    }

    @Override
    public void area() {
        System.out.println("Area of reactangle");
    }

    @Override
    public void largeDraw() {

    }

    @Override
    public void middleDraw() {

    }

    @Override
    public void printBlackWhite() {

    }

    @Override
    public void colorPrint() {

    }
}
