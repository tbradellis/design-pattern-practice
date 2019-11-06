//package com.bellis.headfirst.strategy.behaviors;
//
//import javafx.scene.media.Media;
//import javafx.scene.media.MediaPlayer;
//
//import java.io.File;
//
//public class Quack implements QuackBehavior {
//    private String quackAudioFile = "/Users/bellis/Desktop/desktop_dev/audio/mallardDuckSoundBible.com-433679284.mp3";
//    private Media quack = new Media(new File(quackAudioFile).toURI().toString());
//    private MediaPlayer player = new MediaPlayer(quack);
//
//
//    @Override
//    public void quack() {
//        player.play();
//    }
//}
