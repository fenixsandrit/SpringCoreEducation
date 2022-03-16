package spring.education;

import org.springframework.aop.target.LazyInitTargetSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MusicPlayer {
    private List<Music> music;

    public MusicPlayer(List<Music> music){
        this.music = music;
    }

    public String playMusic(){
        return "Playing: " + (music.get((int)(new Random()).nextInt(3))).getSong();
    }

}
