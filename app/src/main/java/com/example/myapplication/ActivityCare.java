package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageButton;

public class ActivityCare extends AppCompatActivity {
    private Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_care);


        ImageButton button=findViewById(R.id.working);
        button.setOnClickListener(v -> openActivityWorkingProfessional());

        ImageButton button2 =findViewById(R.id.stress);
        button2.setOnClickListener(v -> openActivityStressed());

        ImageButton button3 = findViewById(R.id.conflict);
        button3.setOnClickListener(v -> openActivityResolveConflict());


    }

    public void openActivityWorkingProfessional() {
        Intent intent =new Intent(this, ActivityWorkingProfessional.class);
        startActivity(intent);
    }

    public void openActivityStressed() {
        Intent intent =new Intent(this, ActivityStressed.class);
        startActivity(intent);
    }

    public void openActivityResolveConflict() {
        Intent intent =new Intent(this, ActivityResolveConflict.class);
        startActivity(intent);
    }
}