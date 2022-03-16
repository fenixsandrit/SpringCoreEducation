package spring.education;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

import java.security.PublicKey;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Configuration
@PropertySource("classpath:musicPlayer.properties")
public class SpringConfig {
    @Bean
    public Music classicalMusic(){
        return new ClassicalMusic();
    }
    @Bean
    public Music rockMusic(){
        return new RockMusic();
    }
    @Bean
    public Music rapMusic(){
        return new RapMusic();
    }
    @Bean
    public List<Music> music(){
        return Arrays.asList(classicalMusic(),rapMusic(),rockMusic());
    }
    @Bean
    public MusicPlayer musicPlayer(){
        return new MusicPlayer(music());
    }
    @Bean
    public Computer computer(){
        return new Computer(musicPlayer());
    }

}
