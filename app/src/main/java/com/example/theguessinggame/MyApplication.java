package com.example.theguessinggame;

import android.app.Application;

public class MyApplication extends Application {

    private int highScore = 0;

    public int getHighScore() {
        return highScore;
    }

    public void setHighScore(int score) {
        highScore = score;
    }
}
