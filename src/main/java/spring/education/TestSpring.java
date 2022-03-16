package spring.education;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.awt.*;

public class TestSpring {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(SpringConfig.class);
        Music classicalMusic = context.getBean("classicalMusic",ClassicalMusic.class);
        System.out.println(classicalMusic.getSong());

        Computer computer = context.getBean("computer",Computer.class);
        System.out.println(computer.toString());
        context.close();
    }
}
