package com.example.theguessinggame;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class hintPrompt extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.hint_prompt);
        Button noHint = (Button) findViewById(R.id.noHint);
        Button yesHint = (Button) findViewById(R.id.yesHint);
        TextView prompt = (TextView) findViewById(R.id.message);

        //prompt.setText("You have " + Integer.toString(highscore) + " attempts left. Would you like to continue?");

        noHint.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(hintPrompt.this, PopTwo.class));
            }
        });

        yesHint.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(hintPrompt.this, hint.class));
            }
        });

    }
}
