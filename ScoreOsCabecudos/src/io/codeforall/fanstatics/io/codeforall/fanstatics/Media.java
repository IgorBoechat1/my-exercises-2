package io.codeforall.fanstatics;


import javafx.scene.media.MediaPlayer;

import java.nio.file.Paths;

public class Media {


    private MediaPlayer mediaPlayer;

    public void music() {
        String s = "rsc/background.mp3";
        javafx.scene.media.Media h = new javafx.scene.media.Media(Paths.get(s).toUri().toString());
        mediaPlayer = new javafx.scene.media.MediaPlayer(h);
        mediaPlayer.play();
    }

    public void goalSFX() {
        String s = "rsc/goal.wav";
        javafx.scene.media.Media h = new javafx.scene.media.Media(Paths.get(s).toUri().toString());
        mediaPlayer = new javafx.scene.media.MediaPlayer(h);
        mediaPlayer.play();
    }









}
