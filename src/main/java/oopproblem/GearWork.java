package oopproblem;

import org.springframework.stereotype.Component;

@Component
public class GearWork implements Gear{
    @Override
    public void roll() {
        System.out.println("Rolls");
    }

    @Override
    public void up() {
        System.out.println("Up");
    }
}
