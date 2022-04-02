package com.example.theguessinggame;

import android.app.Application;

public class MyApplication extends Application {

    private int highScore = 0;
    private int target = 0;
    private int attempts = 10;


    public int getTarget() {return target;}

    public void setTarget(int score) {target = score;}

    public void resetAttempts() {attempts = 10;}

    public void attempted() {attempts--;}

    public int getAttempts() {return attempts;}

    public int getHighScore() {
        return highScore;
    }

    public void setHighScore(int score) {
        highScore = score;
    }
}
