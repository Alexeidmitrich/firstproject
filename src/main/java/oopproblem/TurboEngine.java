package oopproblem;

import org.springframework.stereotype.Component;

@Component
public class TurboEngine implements Engine{


    public void work() {
        System.out.println("Turbo works");
    }
}
