package spring.education;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml");
        MusicPlayer mysicPlayer = context.getBean("MusicPlayer",MusicPlayer.class);
        mysicPlayer.playMusic();

        context.close();
    }
}
