package com.steplerss.spring;

public class MusicPlayer {
    private Musik musik;

    //IoC
    public MusicPlayer(Musik musik){
        this.musik = musik;
    }

    public  void  playMusic(){
        System.out.println("Playing: " + musik.getSong());
    }
}
