package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageButton;

import com.example.myapplication.Communication.ActivitySpeak;

public class Activity2 extends AppCompatActivity {
private Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);


        ImageButton button=findViewById(R.id.communicate);
        button.setOnClickListener(v -> openActivitySpeak());

        ImageButton button2 =findViewById(R.id.care);
        button2.setOnClickListener(v -> openActivityCare());

        ImageButton button3 = findViewById(R.id.disease);
        button3.setOnClickListener(v -> openActivityDisease());


    }

    public void openActivitySpeak() {
        Intent intent =new Intent(this, ActivitySpeak.class);
        startActivity(intent);
    }

    public void openActivityCare() {
        Intent intent =new Intent(this, ActivityCare.class);
        startActivity(intent);
    }

    public void openActivityDisease() {
        Intent intent =new Intent(this, ActivityDisease.class);
        startActivity(intent);
    }
}