package com.example.a13challenges;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class CH5 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ch5);
    }

    //challenge 5 button function, swaps 2 numbers from a single input
    public void c5(View view){
        TextView display = findViewById(R.id.display);
        EditText num = findViewById(R.id.Num_Ent_1);

        int p = Integer.parseInt(num.getText().toString());
        int inNum = p;
        int reversed = 0;
        while (inNum!=0){
            int single = inNum % 10;
            reversed = reversed * 10 + single;
            inNum/=10;
        }
        display.setText("" + reversed);
    }
}
