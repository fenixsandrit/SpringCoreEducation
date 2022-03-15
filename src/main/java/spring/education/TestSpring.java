package spring.education;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml");
        Music music = context.getBean("musicBean",RockMusic.class);
        MusicPlayer musicPlayer = new MusicPlayer(music);
        musicPlayer.playMusic();

        Music musicRap = context.getBean("rapMusic",RapMusic.class);
        MusicPlayer musicPlayerRap = new MusicPlayer(musicRap);
        musicPlayerRap.playMusic();

        context.close();
    }
}
