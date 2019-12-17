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
    static int p = 0;
    static int i = 0;
    static int k = 0;
    static double t = 0;

    //Challenge 1 button function, displays 'hello world' on output
    public void c1 (View view){
        TextView textView = findViewById(R.id.display);
        textView.setText("Hello World");
    }

    //challenge 2 button function, checks if what a number is in relation to 5
    public void c2(View view){
        TextView display = findViewById(R.id.display);
        EditText num = findViewById(R.id.entry);
        int num1 = Integer.parseInt(num.getText().toString());
        if (num1 < 5) display.setText(num1 + " is less than 5.");
        else if (num1 > 5) display.setText(num1 + " is more than 5.");
        else display.setText(num1 + " is equal to 5.");
    }

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

    //Challenge 4 button function, prints text 'GeeksforGeeks' specified number of times
    public void c4 (View view) {
        TextView textView = findViewById(R.id.display);
        EditText numEditText = findViewById(R.id.Num_Ent_1);
        int num = Integer.parseInt(numEditText.getText().toString());
        textView.setText(" ");
        for (int i = 1; i <= num; i++){
            textView.append("\n GeeksforGeeks");
        }
    }

    //challenge 5 button function, swaps 2 numbers from a single input
    public void c5(View view){
        TextView display = findViewById(R.id.display);
        EditText num = findViewById(R.id.Num_Ent_1);
        EditText num1 = findViewById(R.id.Num_Ent_2);


        p = Integer.parseInt(num.getText().toString());
        i = Integer.parseInt(num1.getText().toString());
        display.setText(i + " " + p);
    }

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

    //Challenge 7 button function, changes a number to its binary form
    public void c7 (View view) {
        TextView textView = findViewById(R.id.display);
        EditText numEditText = findViewById(R.id.Num_Ent_1);
        String binarynum[] = new java.lang.String[7];
        int num = Integer.parseInt(numEditText.getText().toString());
        if (num >= 64){
            num -= 64;
            binarynum[0] = "1";
        }
        else {
            binarynum[0] = "0";
        }

        if (num >= 32){
            num -= 32;
            binarynum[1] = "1";
        }
        else {
            binarynum[1] = "0";
        }

        if (num >= 16){
            num -= 16;
            binarynum[2] = "1";
        }
        else {
            binarynum[2] = "0";
        }

        if (num >= 8){
            num -= 8;
            binarynum[3] = "1";
        }
        else {
            binarynum[3] = "0";
        }

        if (num >= 4){
            num -= 4;
            binarynum[4] = "1";
        }
        else {
            binarynum[4] = "0";
        }

        if (num >= 2){
            num -= 2;
            binarynum[5] = "1";
        }
        else {
            binarynum[5] = "0";
        }

        if (num >= 1){
            num -= 1;
            binarynum[6] = "1";
        }
        else {
            binarynum[6] = "0";
        }
        textView.setText(" ");
        for(int i = 0; i < binarynum.length; i++) {
            textView.append(binarynum[i]);
        }
    }

    //challenge 8 button function, takes a number in binary form and converts to decimal
    public void c8(View view){
        TextView display = findViewById(R.id.display);
        EditText num = findViewById(R.id.Num_Ent_1);

        int numOne = Integer.parseInt(num.getText().toString(),2);
        display.setText(Integer.toString(numOne));
    }

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

    //challenge 10 button function, takes a number and counts from 1 up to the given number
    public void c10 (View view) {
        TextView textView = findViewById(R.id.display);
        EditText numEditText = findViewById(R.id.Num_Ent_1);
        int num = Integer.parseInt(numEditText.getText().toString());
        textView.setText(" ");
        for(int i = 1; i <= num; i++){
            textView.append(i + " ");
        }
    }

    //challenge 11 button function, takes in 3 different numbers and takes the one in middle
    public void c11(View view){
        TextView textView = findViewById(R.id.display);
        EditText num = findViewById(R.id.Num_Ent_1);
        EditText num1 = findViewById(R.id.Num_Ent_2);
        EditText num2 = findViewById(R.id.Num_Ent_3);

        p = Integer.parseInt(num.getText().toString());
        i = Integer.parseInt(num1.getText().toString());
        k = Integer.parseInt(num2.getText().toString());
        textView.setText("" + i);
    }

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
