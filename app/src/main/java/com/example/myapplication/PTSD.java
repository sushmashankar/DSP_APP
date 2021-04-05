package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class PTSD extends AppCompatActivity {

    TextView textview;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_p_t_s_d);

        //textview = (TextView)findViewById(R.id.textView2);

        //String Tempholder= getIntent().getStringExtra("Listviewclickvalue");
        //textview.setText(Tempholder);
    }
}