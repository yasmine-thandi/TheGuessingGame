package com.example.theguessinggame;

import android.widget.Button;
import android.widget.EditText;
import java.util.Random;

public class Randomizer{

    public static int randomizeNumber(int intGuess) {
        int min = 1;
        int randomNumber = 0;
        if (hardButton.isPressed()) {
            int max = (100);
            randomNumber = (int) Math.floor(Math.random() * (max - min + 1) + min);
        } else if (normalButton.isPressed()) {
            int max = (50);
            randomNumber = (int) Math.floor(Math.random() * (max - min + 1));
        }
        return randomNumber;
    }
}
