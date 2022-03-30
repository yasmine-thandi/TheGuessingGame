package com.example.theguessinggame;

import android.app.Activity;
import android.os.Bundle;
import android.util.DisplayMetrics;

public class PopTwo extends Pop {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.popwindow);

        DisplayMetrics Dm = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(Dm);

        int Width = Dm.widthPixels;
        int Height = Dm.heightPixels;

        getWindow().setLayout(Width, Height);


    }
}
