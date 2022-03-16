package spring.education;

import org.springframework.aop.target.LazyInitTargetSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
@Component
public class MusicPlayer {

    private Music music1,music2;

    @Autowired
    public MusicPlayer(@Qualifier("rapMusic") Music music1,
                       @Qualifier("rockMusic") Music music2){
        this.music1 = music1;
        this.music2 = music2;
    }


    public String playMusic(){
        return ("Playing: " + music1.getSong() + "\n" + "  also playing: " + music2.getSong());
    }

}
