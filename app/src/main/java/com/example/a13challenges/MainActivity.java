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

    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        String num = input.nextLine();
        Schroga.eight(num);
    }
    //Challenge 1 button function
    public void c1 (View view){
        TextView textView = findViewById(R.id.display);
        textView.setText("Hello World");
    }
    //Challenge 4 button function
    public void c4 (View view) {
        TextView textView = findViewById(R.id.display);
        EditText numEditText = findViewById(R.id.Num_Ent_1);
        int num = Integer.parseInt(numEditText.getText().toString());
        textView.setText(" ");
        for (int i = 1; i <= num; i++){
            textView.append("\n GeeksforGeeks");
        }
    }
    //Challenge 7 button function
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
    public void c10 (View view) {
        TextView textView = findViewById(R.id.display);
        EditText numEditText = findViewById(R.id.Num_Ent_1);
        int num = Integer.parseInt(numEditText.getText().toString());
        textView.setText(" ");
        for(int i = 1; i <= num; i++){
            textView.append(i + " ");
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
