package com.example.theguessinggame;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import org.w3c.dom.Text;

public class hint extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.hint);
        Button exit = (Button) findViewById(R.id.exitHint);
        TextView hint = (TextView) findViewById(R.id.hint);
        
        String guess = "15";
        String target = String.valueOf(((MyApplication) this.getApplication()).getTarget());

        if (Math.abs(Integer.valueOf(guess) - Integer.valueOf(target)) >= 10) {
            hint.setText("You are far from the target!");
        }
        else {
            hint.setText("You are close to the target!");
        }


        exit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(hint.this,PopTwo.class);
                startActivity(intent);
            }
        });
        
        
    }
}
