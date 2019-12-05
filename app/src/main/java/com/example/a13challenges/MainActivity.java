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
    static int p=0;
    static int i=0;
    static double t=0;

    public void two(View view){
        TextView display = findViewById(R.id.display);
        EditText num = findViewById(R.id.Num_Ent_1);
        int num1 = Integer.parseInt(String.valueOf(num));
        if (num1 < 5) display.setText(num1 + " is less than 5.");
        else if (num1 > 5) display.setText(num1 + " is more than 5.");
        else display.setText(num1 + " is equal to 5.");
    }
    public void C3(View view) {
        TextView tV3 = findViewById(R.id.display);
        TextView tV4 = findViewById(R.id.display1);
        TextView tV5 = findViewById(R.id.display2);
        TextView tV6 = findViewById(R.id.display3);
        EditText c3A =  findViewById(R.id.Num_Ent_1);
        EditText c3B = findViewById(R.id.Num_Ent_2);

        p = Integer.parseInt(c3A.getText().toString());
        i = Integer.parseInt(c3B.getText().toString());
        int a = MainActivity.p;
        int b = MainActivity.i;
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
    public void five(View view){
        TextView display = findViewById(R.id.display);
        EditText num = findViewById(R.id.Num_Ent_1);
        String num1 = num.toString();
        String [] num2 = num1.split(" ");
        display.setText(num2[1] + " " + num2[0]);
    }
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
    public void eight(View view){
        TextView display = findViewById(R.id.display);
        EditText num = findViewById(R.id.Num_Ent_1);
        String num1 = num.toString();
        char [] num2 = num1.toCharArray();
        double total = 0;
        for (int i = num.length(); i > 0; i--){
            if (num2[i] != '1' || num2[i] != '0') System.exit(1);
            total = total + (i ^ 2);
        }
        display.setText(total + "");
    }
    public void c9(View view){
        TextView tV = findViewById(R.id.display);
        EditText eT = findViewById(R.id.Num_Ent_1);
        EditText eT2 = findViewById(R.id.Num_Ent_2);

        t = Double.parseDouble(eT.getText().toString());
        p = Integer.parseInt(eT2.getText().toString());
        //Enter The degree of fahrenheit or celsius
        double D = t;
        //Fahrenheit to celsius type '1' ; Celsius to Fahrenheit type '2'");
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
    public void eleven(View view){
        TextView display = findViewById(R.id.display);
        EditText num = findViewById(R.id.Num_Ent_1);
        String num1 = num.toString();
        String num2[] = num1.split(" ");
        System.out.println(num2[1]);
    }
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
