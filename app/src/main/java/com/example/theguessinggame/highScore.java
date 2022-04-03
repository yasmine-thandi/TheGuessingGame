package com.example.theguessinggame;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class highScore extends AppCompatActivity {
    int uScore = ((MyApplication) this.getApplication()).getAttempts() * 100;
    int highScore = ((MyApplication) this.getApplication()).getHighScore();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView userScore = (TextView) findViewById((R.id.userScore));
        if (uScore > highScore) {
                highScore = uScore;
            ((MyApplication) this.getApplication()).setHighScore(highScore);
        }

        userScore.setText(highScore);

        Button exit = (Button) findViewById(R.id.exit);

        exit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(highScore.this, hintPrompt.class);
                startActivity(i);
            }
        });


    }
}
