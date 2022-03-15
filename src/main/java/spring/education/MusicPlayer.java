package spring.education;

import org.springframework.aop.target.LazyInitTargetSource;

import java.util.ArrayList;
import java.util.List;

public class MusicPlayer {
    private Music music;
    private String name;
    private int volume;
    private List<Music> musics ;
    public void setMusics(List<Music> musics){
        this.musics = musics;
    }
    public List<Music> getMusics(){
        return this.musics;
    }

    public MusicPlayer(){};

    public MusicPlayer(Music music) {
        this.music = music;
    }

    public void setMusic(Music music) {
        this.music = music;
    }

    public Music getMusic() {
        return music;
    }

    public void playMusic(){
        System.out.println("Playing: " + music.getSong());
    }

    public void playMusics(){
        for (Music music : musics) {
            System.out.println("Playing: " + music.getSong());
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }


}
