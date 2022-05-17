package polymorphism;

import java.util.ArrayList;
import java.util.List;

public class Demo {

    public static void main(String[] args) {
        //Type      reference = new Object();
        Reactangle reactangle = new Reactangle();
       // reactangle.
        //reactangle.area();
        //reactangle.perimetr();
        Triangle triangle = new Triangle();
       // triangle.area();
       // triangle.perimetr();
        Shape shape = new Reactangle();
        shape.area();
        shape.perimetr();

/*
        List<Shape> list = new ArrayList<>();
        list.add(new Reactangle());
        list.add(new Triangle());
        list.add(new Circle());
        for (int i = 0; i < list.size(); i++) {
            Shape s = list.get(i);
            s.perimetr();
            s.area();
        }

 */
    }
}
