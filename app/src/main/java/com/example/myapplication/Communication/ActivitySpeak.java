package com.example.myapplication.Communication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MotionEvent;

import com.example.myapplication.R;
import com.example.myapplication.SwipeLeft;
import com.example.myapplication.SwipeRight;

public class ActivitySpeak extends AppCompatActivity {
  float x1,x2,y1,y2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_speak);
    }

        public boolean onTouchEvent(MotionEvent touchEvent){
            switch(touchEvent.getAction()){

                case MotionEvent.ACTION_DOWN:
                    x1 = touchEvent.getX();
                    y1 = touchEvent.getY();
                    break;
                case MotionEvent.ACTION_UP:
                    x2 = touchEvent.getX();
                    y2 = touchEvent.getY();
                    if(x1 < x2){

                    Intent intent = new Intent(ActivitySpeak.this, SwipeLeft.class);
                    startActivity(intent);
                } if (x1 > x2){

                    Intent intent = new Intent(ActivitySpeak.this, SwipeRight.class);
                    startActivity(intent);
                }
                break;
            }
            return false;
        }




}
