package com.example.theguessinggame;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.PopupWindow;

public class PopTwo extends Pop {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.popwindow);
        Button submit = (Button) findViewById(R.id.button8);
        EditText guess = (EditText) findViewById(R.id.editTextNumber2);

        DisplayMetrics Dm = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(Dm);

        int Width = Dm.widthPixels;
        int Height = Dm.heightPixels;

        getWindow().setLayout(Width, Height);
        
        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String regexStr = "^[0-9]*$";
                if (guess.getText().toString().trim().matches(regexStr)) {
                    Intent i = new Intent(PopTwo.this, TypeName.class);
                        i.putExtra(guess, "userGuess");
                        startActivity(i);
                } else {
                    LayoutInflater inflater = (LayoutInflater)
                            getSystemService(LAYOUT_INFLATER_SERVICE);
                    @SuppressLint("InflateParams") View popupView = inflater.inflate(R.layout.popup_inputwindow, null);

                    int width = LinearLayout.LayoutParams.WRAP_CONTENT;
                    int height = LinearLayout.LayoutParams.WRAP_CONTENT;
                    boolean focusable = true;
                    final PopupWindow popupWindow = new PopupWindow(popupView, width, height, focusable);

                    popupWindow.showAtLocation(view, Gravity.CENTER, 0, 0);

                    popupView.setOnTouchListener(new View.OnTouchListener() {
                        @SuppressLint("ClickableViewAccessibility")
                        @Override
                        public boolean onTouch(View v, MotionEvent event) {
                            popupWindow.dismiss();
                            return true;
                        }
                    });
                }
            }
        });
    }
}
