package com.example.a13challenges;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class CH1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ch1);
    }

    //Challenge 1 button function, displays 'hello world' on output
    public void c1 (View view){
        TextView textView = findViewById(R.id.display);
        textView.setText("Hello World");
    }
}
