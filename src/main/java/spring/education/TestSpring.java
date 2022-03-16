package spring.education;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.awt.*;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml");
        Music classicalMusic = context.getBean("classicalMusic",ClassicalMusic.class);
        System.out.println(classicalMusic.getSong());
        context.close();
    }
}
