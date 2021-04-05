package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;


import androidx.appcompat.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity {




    @Override
    protected void onCreate(android.os.Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



       ImageButton button = findViewById(R.id.custom_learn);

        button.setOnClickListener(v -> openActivity2());
    }
        public void openActivity2() {
            Intent intent =new Intent(this, Activity2.class);
            startActivity(intent);
        }


    }
