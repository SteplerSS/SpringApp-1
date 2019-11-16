package com.steplerss.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "aplicationContext.xml");
        Musik music = context.getBean("musicBean", Musik.class);

        MusicPlayer musicPlayer = new MusicPlayer(music);

        musicPlayer.playMusic();
        context.close();
    }
}
