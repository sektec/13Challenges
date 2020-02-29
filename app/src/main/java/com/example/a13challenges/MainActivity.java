package com.example.a13challenges;
import java.util.*;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import android.widget.Button;

import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private Button b1;
    private Button b2;
    private Button b3;
    private Button b4;
    private Button b5;
    private Button b6;
    private Button b7;
    private Button b8;
    private Button b9;
    private Button b10;
    private Button b11;
    private Button b12;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    b1 = findViewById(R.id.Challenge1B);
    b1.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            openCH1();
        }
    });

    b2 = findViewById(R.id.Challenge2B);
    b2.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            openCH2();
        }
    });

    b3 = findViewById(R.id.Challenge3B);
    b3.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            openCH3();
        }
    });

    b4 = findViewById(R.id.Challenge4B);
    b4.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            openCH4();
        }
    });

    b5 = findViewById(R.id.Challenge5B);
    b5.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            openCH4();
        }
    });

        b6 = findViewById(R.id.Challenge6B);
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openCH6();
            }
        });

        b7 = findViewById(R.id.Challenge7B);
        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openCH7();
            }
        });

        b8 = findViewById(R.id.Challenge8B);
        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openCH8();
            }
        });

        b9 = findViewById(R.id.Challenge9B);
        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openCH9();
            }
        });

        b10 = findViewById(R.id.Challenge10B);
        b10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openCH10();
            }
        });

        b11 = findViewById(R.id.Challenge11B);
        b11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openCH11();
            }
        });

        b12 = findViewById(R.id.Challenge12B);
        b12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openCH12();
            }
        });
    }


    public void openCH1(){
        Intent intent = new Intent(this, CH1.class);
        startActivity(intent);
    }

    public void openCH2(){
        Intent intent = new Intent( this, CH2.class);
        startActivity((intent));
    }

    public void openCH3(){
        Intent intent = new Intent(this, CH3.class);
        startActivity(intent);
    }
    public void openCH4(){
        Intent intent = new Intent(this, CH4.class);
        startActivity(intent);
    }
    public void openCH5(){
        Intent intent = new Intent(this, CH5.class);
        startActivity(intent);
    }
    public void openCH6(){
        Intent intent = new Intent(this, CH6.class);
        startActivity(intent);
    }
    public void openCH7(){
        Intent intent = new Intent(this, CH7.class);
        startActivity(intent);
    }
    public void openCH8(){
        Intent intent = new Intent(this, CH8.class);
        startActivity(intent);
    }
    public void openCH9(){
        Intent intent = new Intent(this, CH9.class);
        startActivity(intent);
    }
    public void openCH10(){
        Intent intent = new Intent(this, CH10.class);
        startActivity(intent);
    }
    public void openCH11(){
        Intent intent = new Intent(this, CH11.class);
        startActivity(intent);
    }
    public void openCH12(){
        Intent intent = new Intent(this, CH12.class);
        startActivity(intent);
    }



}
