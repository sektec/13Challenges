package com.example.a13challenges;
import java.util.*;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void two(View view){//Best of five
        TextView display = findViewById(R.id.display);
        EditText num = findViewById(R.id.entry);
        int num1 = Integer.parseInt(String.valueOf(num));
        if (num1 < 5) display.setText(num1 + " is less than 5.");
        else if (num1 > 5) display.setText(num1 + " is more than 5.");
        else display.setText(num1 + " is equal to 5.");
    }
    public void five(View view){//Number swap
        TextView display = findViewById(R.id.display);
        EditText num = findViewById(R.id.entry);
        String num1 = num.toString();
        String [] num2 = num1.split(" ");
        display.setText(num2[1] + " " + num2[0]);
    }
    public void eight(View view){//Binary to Decimal
        TextView display = findViewById(R.id.display);
        EditText num = findViewById(R.id.entry);
        String num1 = num.toString();
        char [] num2 = num1.toCharArray();
        double total = 0;
        for (int i = num.length(); i > 0; i--){
            if (num2[i] != '1' || num2[i] != '0') System.exit(1);
            total = total + (i ^ 2);
        }
        display.setText(total + "");
    }
    public void eleven(View view){//Middle of three
        TextView display = findViewById(R.id.display);
        EditText num = findViewById(R.id.entry);
        String num1 = num.toString();
        String num2[] = num1.split(" ");
        display.setText(num2[1]);
    }
}
