package com.example.theguessinggame;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class highScore extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView score = (TextView) findViewById(R.id.userScore);
        TextView giveHighScore = (TextView) findViewById(R.id.highScore);
        Button exit = (Button) findViewById(R.id.exit);

        int highscore = 0;

        exit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(highScore.this, hintPrompt.class);
                i.putExtra("highscore", highscore);
                startActivity(i);
            }
        });


    }
}
