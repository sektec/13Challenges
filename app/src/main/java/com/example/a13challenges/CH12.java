package com.example.a13challenges;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class CH12 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ch12);
    }
    static int p = 0;

    //challenge 12 button function, checks if a number is a palindrome or not
    public void c12(View view){
        TextView tV = findViewById(R.id.display);
        EditText num = findViewById(R.id.Num_Ent_1);

        p = Integer.parseInt(num.getText().toString());
        int nume = p;
        int counter1 = 0;
        int original = nume;

        while (nume>0){
            int single = nume % 10;
            counter1 = (counter1 * 10) + single;
            nume/=10;
        }
        if (original == counter1)
            tV.setText("This is a palindrome");
        else
            tV.setText("This is not a palindrome");
    }
}
