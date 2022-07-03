package oopproblem;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;


@Component
public class Plane {

    @Autowired
    private Engine engine;
    @Autowired
    private Gear gear;




    public void fly(){
        engine.work();
        gear.up();
        gear.roll();


    }

    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
        ctx.register(DemoSpring.class);
        ctx.refresh();
        Plane plane = ctx.getBean(Plane.class);

        plane.fly();
    }
}
