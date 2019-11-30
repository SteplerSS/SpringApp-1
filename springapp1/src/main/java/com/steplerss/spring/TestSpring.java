package com.steplerss.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "aplicationContext.xml");

        MusicPlayer musicPlayer = context.getBean("musicplayer", MusicPlayer.class);
        musicPlayer.playMusic();

        context.close();
    }
}
