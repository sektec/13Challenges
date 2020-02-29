package com.example.a13challenges;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class CH9 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ch9);
    }
    static int p = 0;
    static int i = 0;
    static int k = 0;
    static double t = 0;
    //challenge 9 button function, converts degree of celsius to fahrenheit or vice versa
    public void c9(View view){
        TextView tV = findViewById(R.id.display);
        EditText eT = findViewById(R.id.Num_Ent_1);
        EditText eT2 = findViewById(R.id.Num_Ent_2);

        t = Double.parseDouble(eT.getText().toString());
        p = Integer.parseInt(eT2.getText().toString());
        double D = t;
        int T = p;
        switch (T){
            case 1 :
                tV.setText("The conversion from Fahrenheit to Celsius of "
                        + D + " is " + ((D - 32) * 5/9));
                break;
            case 2 :
                tV.setText("The conversion from Celsius to Fahrenheit of "
                        + D + " is " + ((D * 9/5) + 32));
                break;
            default:
                tV.setText("Bruh!?!?");
                System.exit(1);
                break;
        }
    }
}
