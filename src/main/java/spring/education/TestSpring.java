package spring.education;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml");
        MusicPlayer musicPlayer1 = context.getBean("musicPlayer1",MusicPlayer.class);
        MusicPlayer musicPlayer2 = context.getBean("musicPlayer1",MusicPlayer.class);
        MusicPlayer musicPlayer3 = context.getBean("musicPlayer2",MusicPlayer.class);
        MusicPlayer musicPlayer4 = context.getBean("musicPlayer2",MusicPlayer.class);

        //out = true
        System.out.println(musicPlayer1 == musicPlayer2);
        //out = false
        System.out.println(musicPlayer3 == musicPlayer4);

        context.close();
    }
}
