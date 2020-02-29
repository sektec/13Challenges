package com.example.a13challenges;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class CH3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ch3);
    }
    static int p = 0;
    static int i = 0;
    static int k = 0;
    static double t = 0;

    //challenge 3 button function, does 4 types of math for 2 numbers (add, sub, div, mul)
    public void C3(View view) {
        TextView tV3 = findViewById(R.id.display);
        TextView tV4 = findViewById(R.id.display1);
        TextView tV5 = findViewById(R.id.display2);
        TextView tV6 = findViewById(R.id.display3);
        EditText c3A =  findViewById(R.id.Num_Ent_1);
        EditText c3B = findViewById(R.id.Num_Ent_2);

        p = Integer.parseInt(c3A.getText().toString());
        i = Integer.parseInt(c3B.getText().toString());
        int a = p;
        int b = i;
        tV3.setText("The Sum of " + a + " and " + b + " is " + (a+b));
        if (a < b) {
            tV4.setText("The difference of " + b + " and " + a + " is " + (b - a));
            if (a == 0) {
                tV5.setText("This equation is undefined since you cant divide by 0");
            } else {
                tV5.setText("The product of " + b + " divided by " + a + " is " + (b / a));
            }
        } else if (a > b) {
            tV4.setText("The difference of " + a + " and " + b + " is " + (a - b));
            if (b == 0) {
                tV5.setText("This equation is undefined since you cant divide by 0");
            } else {
                tV5.setText("The product of " + a + " divided by " + b + " is " + (a / b));
            }
        } else {
            tV4.setText("The digits are the same so the difference of "
                    + a + " and " + b + " is " + (a - b));
            if (b == 0) {
                tV5.setText("This equation is undefined since you cant divide by 0");
            } else {
                tV5.setText("Since the digits are the same the product of "
                        + a + " divided by " + b + " is " + (a / b));
            }
        }
        tV6.setText("The product of " + a + " multiplied by " + b + " is " + (a * b));
    }
}
