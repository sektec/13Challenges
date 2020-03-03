package com.example.a13challenges;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class CH11 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ch11);
    }

    //challenge 11 button function, takes in 3 different numbers and displays greatest # from them
    public void c11(View view){
        TextView textView = findViewById(R.id.display);
        EditText num = findViewById(R.id.Num_Ent_1);
        EditText num1 = findViewById(R.id.Num_Ent_2);
        EditText num2 = findViewById(R.id.Num_Ent_3);

        int p = Integer.parseInt(num.getText().toString());
        int i = Integer.parseInt(num1.getText().toString());
        int k = Integer.parseInt(num2.getText().toString());

        if (p>i){
            textView.setText("" + p);
        }
        else if(i>k){
            textView.setText("" + i);
        }
        else {
            textView.setText("" + k);
        }
    }

}
