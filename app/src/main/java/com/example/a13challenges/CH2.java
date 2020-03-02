package com.example.a13challenges;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class CH2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ch2);
    }

    //challenge 2 button function, checks if what a number is in relation to 5
    public void c2(View view){
        TextView display = findViewById(R.id.display);
        EditText num = findViewById(R.id.entry);
        double num1 = Integer.parseInt(num.getText().toString());
        if (num1 < 5) display.setText(num1 + " is less than 5.");
        else if (num1 > 5) display.setText(num1 + " is more than 5.");
        else display.setText(num1 + " is equal to 5.");
    }
}
