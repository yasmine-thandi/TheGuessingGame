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
        Button exit = (Button) findViewById(R.id.exit);
        TextView prompt = (TextView) findViewById(R.id.message);
        ((MyApplication) this.getApplication()).attempted();
        String attempts = String.valueOf(((MyApplication) this.getApplication()).getAttempts());
        prompt.setText("You have " + attempts + " attempts left. Would you like a hint?");

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
        
        exit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                moveTaskToBack(true);
                android.os.Process.killProcess(android.os.Process.myPid());
                System.exit(1);
        }
        });
    }
}

