package com.example.theguessinggame;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import org.w3c.dom.Text;

public class hint extends hintPrompt {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.hint);
        TextView howClose = findViewById(R.id.hint);
        TextView hintHeader = findViewById(R.id.hintHeader);
        Button exit = (Button) findViewById(R.id.exitHint);

        hintHeader.setText(getResources().getString(R.string.HintHeader));
        exit.setText(getResources().getString(R.string.ExitButton));

        exit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(hint.this, hintPrompt.class));
            }
        });
    }
}
