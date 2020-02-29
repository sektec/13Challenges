package com.example.a13challenges;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class CH4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ch4);
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
}
