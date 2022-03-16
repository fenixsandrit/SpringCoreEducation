package spring.education;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.awt.*;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml");
        Music m1 = context.getBean("rockMusic",RockMusic.class);
        Music m2 = context.getBean("rockMusic",RockMusic.class);
        Music m3 = context.getBean("rapMusic",RapMusic.class);
        Music m4 = context.getBean("rapMusic",RapMusic.class);
        //Scope prototype
        System.out.println(m1 == m2);
        //Scope singleton
        System.out.println(m3 == m3);
        context.close();
    }
}
