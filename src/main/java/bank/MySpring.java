package bank;


import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "bank")
public class MySpring {


    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
        ctx.register(MySpring.class);
        ctx.refresh();
        BankRefactoring bankRefactoring = ctx.getBean(BankRefactoring.class);

    }
}
