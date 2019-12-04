package com.example.a13challenges;
import java.util.*;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
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
    }
}
