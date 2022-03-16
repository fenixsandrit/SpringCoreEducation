package spring.education;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Computer {
    private int id;
    private MusicPlayer musicPlayer;

    @Autowired
    public Computer(MusicPlayer musicPlayer) {
        this.id = 1;
        this.musicPlayer = musicPlayer;
    }

    @Override
    public String toString() {
        return "Computer " + id + ", playing: " + musicPlayer.playMusic() + "\n musicPlayer name: "
                + musicPlayer.getName() + " musicPlayer volume: " + musicPlayer.getVolume();
    }
}
