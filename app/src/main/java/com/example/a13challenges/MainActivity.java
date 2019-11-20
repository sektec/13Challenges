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

        Button B2 = findViewById(R.id.Challenge2B);
        TextView display = findViewById(R.id.display);
    }
    public void two(View view){
        TextView display = findViewById(R.id.display);
        EditText num = findViewById(R.id.Num_Ent_1);
        int num1 = Integer.parseInt(String.valueOf(num));
        if (num1 < 0 || num1 > 9) System.exit(0);
        if (num1 < 5) display.setText(num1 + " is less than 5.");
        else if (num1 > 5) display.setText(num1 + " is more than 5.");
        else display.setText(num1 + " is equal to 5.");
    }
    public static void five(String num){
        String num2[] = num.split(" ");
        System.out.println(num2[1] + " " + num2[0]);
    }
    public static void eight(String num){
        char [] num2 = num.toCharArray();
        double total = 0;
        for (int i = num.length(); i > 0; i--){
            if (num2[i] != '1' || num2[i] != '0') System.exit(1);
            total = total + (i ^ 2);
        }
        System.out.println(total);
    }
    public static void eleven(String num){
        String num2[] = num.split(" ");
        System.out.println(num2[1]);
    }
}
