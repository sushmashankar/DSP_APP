package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class ActivityDisease extends AppCompatActivity {

    String[] diseases ={"Understanding dementia","PTSD","Parkinson's", "Understanding Alzheimer’s", "Traumatic Brain Injury" };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_disease);

      ListView list = findViewById(R.id.list_view);

        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, diseases);
        list.setAdapter(arrayAdapter);

       list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
           @Override
           public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
             String TempListView=diseases[position].toString();

            if(diseases[position].toString() == diseases[0]){
             Intent intent = new Intent(ActivityDisease.this,Dementia.class);
             //intent.putExtra("Listviewclickvalue",TempListView);
             startActivity(intent);}


                if(diseases[position].toString() == diseases[1]){
                     Intent intent = new Intent(ActivityDisease.this,PTSD.class);
                    //intent.putExtra("Listviewclickvalue",TempListView);
                    startActivity(intent);}

                if(diseases[position].toString() == diseases[2]){
                   Intent intent = new Intent(ActivityDisease.this,Parkinson.class);
                //intent.putExtra("Listviewclickvalue",TempListView);
                startActivity(intent);}

               if(diseases[position].toString() == diseases[3]){
                   Intent intent = new Intent(ActivityDisease.this,ALZ.class);
                   //intent.putExtra("Listviewclickvalue",TempListView);
                   startActivity(intent);}

               if(diseases[position].toString() == diseases[4]){
                   Intent intent = new Intent(ActivityDisease.this,BrainInjury.class);
                   //intent.putExtra("Listviewclickvalue",TempListView);
                   startActivity(intent);}












    };
   });
}}