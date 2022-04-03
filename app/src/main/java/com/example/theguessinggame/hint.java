package com.example.theguessinggame;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;  

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
        int attempts = ((MyApplication) this.getApplication()).getAttempts();
        int attemptLeft = 10 - attempts;

        if (Math.abs(Integer.valueOf(guess) - Integer.valueOf(target)) >= 10) {
            hint.setText("You are far from the target!");
        }
        else {
            hint.setText("You are close to the target!");
        }
        
        if (Integer.valueOf(guess) == Integer.valueOf(target)) {
            Toast.makeText(getApplicationContext(), "Congratulations, You Win! You found the number " + target + " in " + attemptLeft + " tries.",Toast.LENGTH_SHORT).show();
        }
        if (attempts == 0){
            Toast.makeText(getApplicationContext(), "Unfortunately, You Lose. The ran out of tries", Toast.LENGTH_SHORT).show();
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
