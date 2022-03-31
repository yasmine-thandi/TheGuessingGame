package com.example.theguessinggame;

import android.widget.Button;
import android.widget.EditText;
import java.util.Random;

public class Randomizer{

    EditText guessNumber = (EditText) findViewById(R.id.guessBox);
    String guessString = guessNumber.getText().toString();

    int intGuess = Randomizer.toInteger(guessString);
    int randomNumber = Randomizer.randomizeNumber(intGuess);

    public static int toInteger(String guessString)
    {
        int result = Integer.parseInt(guessString);
        return result;
    }

    public static int randomizeNumber(int intGuess) {
        int min = 1;
        int randomNumber = 0;
        if (hardButton.isPressed()) {
            int max = (intGuess * 10);
            randomNumber = (int) Math.floor(Math.random() * (max - min + 1) + min);
        } else if (normalButton.isPressed()) {
            int max = (intGuess * 5);
            randomNumber = (int) Math.floor(Math.random() * (max - min + 1));
        }
        return randomNumber;
    }
}