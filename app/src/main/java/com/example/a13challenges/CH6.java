package com.example.a13challenges;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class CH6 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ch6);
    }
    static int p = 0;

    //challenge 6 button function, reverses a number from an input
    public void C6(View view){
        TextView tV3 = findViewById(R.id.display);
        EditText num = findViewById(R.id.Num_Ent_1);

        p = Integer.parseInt(num.getText().toString());
        int inNum = p;
        int reversed = 0;
        while (inNum!=0){
            int single = inNum % 10;
            reversed = reversed * 10 + single;
            inNum/=10;
        }
        tV3.setText("Reversed Number: " + reversed);
    }
}
