package spring.education;

import org.springframework.aop.target.LazyInitTargetSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
@Component
public class MusicPlayer {

    private RapMusic rapMusic;
    private RockMusic rockMusic;
    @Autowired
    public MusicPlayer(RockMusic rockMusic, RapMusic rapMusic) {
        this.rapMusic = rapMusic;
        this.rockMusic = rockMusic;
    }


    public String playMusic(){
        return ("Playing: " + rapMusic.getSong() + "\n     also playing: " + rockMusic.getSong());
    }

}
