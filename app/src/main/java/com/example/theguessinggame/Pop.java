package com.example.theguessinggame;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.View;
import android.widget.Button;

public class Pop extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.popwindowtwo);

        DisplayMetrics dm = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(dm);

        int width = dm.widthPixels;
        int height = dm.heightPixels;

        getWindow().setLayout(width, height);

        Button button4 = (Button) findViewById(R.id.button4);
        Button button3 = (Button) findViewById(R.id.button3);

        int min = 1;
        int max = (50);
        int randomNumber = (int) Math.floor(Math.random() * (max - min + 1) + min);

        ((MyApplication) this.getApplication()).setTarget(randomNumber);
        
        button3.setOnClickListener(new View.OnClickListener() {
               @Override
            public void onClick(View view) {
                moveTaskToBack(true);
                android.os.Process.killProcess(android.os.Process.myPid());
                System.exit(1);
            }
        });
       
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Pop.this, PopTwo.class));
            }
        });
    }
}
