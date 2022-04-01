package com.example.theguessinggame;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class TypeName extends AppCompatActivity {

    Button mButton;
    EditText mEdit;
    TextView mText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.type_name);

        mButton = (Button)findViewById(R.id.button2);
        mButton2 = (Button)findViewById(R.id.button);
        mButton.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            public void onClick(View view) {
                mEdit   = (EditText)findViewById(R.id.editTextTextPersonName);
                mText = (TextView)findViewById(R.id.textView);
                mText.setText("Thanks for playing " + mEdit.getText().toString() + "!");
            }
        });
        mButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                moveTaskToBack(true);
                android.os.Process.killProcess(android.os.Process.myPid());
                System.exit(1);
            }
        });
    }
}
}
}
