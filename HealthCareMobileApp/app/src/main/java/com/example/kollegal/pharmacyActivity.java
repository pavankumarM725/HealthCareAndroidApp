package com.example.kollegal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class pharmacyActivity extends AppCompatActivity {
     TextView loc1,loc2,loc3,loc4,loc5,loc6,loc7,loc8,loc9,loc10;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pharmacy);
        loc1 = findViewById(R.id.LOACTION);
        loc2 = findViewById(R.id.LOACTION1);
        loc3 = findViewById(R.id.LOACTION2);
        loc4 = findViewById(R.id.LOACTION3);
        loc5 = findViewById(R.id.LOACTION4);
        loc6 = findViewById(R.id.LOACTION5);
        loc7 = findViewById(R.id.LOACTION6);
        loc8 = findViewById(R.id.LOACTION7);
        loc9 = findViewById(R.id.LOACTION8);
        loc10 = findViewById(R.id.LOACTION9);

        loc1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String loc = "Sree Chandra Medicals Kollegal";
                Uri uri = Uri.parse("geo:0,0?q=" + Uri.encode(loc));
                Intent mapIntent = new Intent(Intent.ACTION_VIEW, uri);
                mapIntent.setPackage("com.google.android.apps.maps");
                startActivity(mapIntent);
            }
        });
        loc2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String loc = "Dhanalakshmi Medicals Kollegal";
                Uri uri = Uri.parse("geo:0,0?q=" + Uri.encode(loc));
                Intent mapIntent = new Intent(Intent.ACTION_VIEW, uri);
                mapIntent.setPackage("com.google.android.apps.maps");
                startActivity(mapIntent);
            }
        });
        loc3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String loc = "Datta Medicals Kollegal";
                Uri uri = Uri.parse("geo:0,0?q=" + Uri.encode(loc));
                Intent mapIntent = new Intent(Intent.ACTION_VIEW, uri);
                mapIntent.setPackage("com.google.android.apps.maps");
                startActivity(mapIntent);
            }
        });

        loc4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String loc = "Sri Krishna Medicals Kollegal";
                Uri uri = Uri.parse("geo:0,0?q=" + Uri.encode(loc));
                Intent mapIntent = new Intent(Intent.ACTION_VIEW, uri);
                mapIntent.setPackage("com.google.android.apps.maps");
                startActivity(mapIntent);
            }
        });
        loc5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String loc = "Apollo Pharmacy Dr Rajkumar Road Kollegala";
                Uri uri = Uri.parse("geo:0,0?q=" + Uri.encode(loc));
                Intent mapIntent = new Intent(Intent.ACTION_VIEW, uri);
                mapIntent.setPackage("com.google.android.apps.maps");
                startActivity(mapIntent);
            }
        });
       loc6.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               String loc = "Apollo Pharmacy Kollegala 2";
               Uri uri = Uri.parse("geo:0,0?q=" + Uri.encode(loc));
               Intent mapIntent = new Intent(Intent.ACTION_VIEW, uri);
               mapIntent.setPackage("com.google.android.apps.maps");
               startActivity(mapIntent);
           }
       });
       loc7.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               String loc = "Jagadish Medicals Kollegal";
               Uri uri = Uri.parse("geo:0,0?q=" + Uri.encode(loc));
               Intent mapIntent = new Intent(Intent.ACTION_VIEW, uri);
               mapIntent.setPackage("com.google.android.apps.maps");
               startActivity(mapIntent);
           }
       });
       loc8.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               String loc = "New Ravi Medicals Kollegal";
               Uri uri = Uri.parse("geo:0,0?q=" + Uri.encode(loc));
               Intent mapIntent = new Intent(Intent.ACTION_VIEW, uri);
               mapIntent.setPackage("com.google.android.apps.maps");
               startActivity(mapIntent);
           }
       });
       loc9.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               String loc = "Vijayalakshmi Medicals Kollegal";
               Uri uri = Uri.parse("geo:0,0?q=" + Uri.encode(loc));
               Intent mapIntent = new Intent(Intent.ACTION_VIEW, uri);
               mapIntent.setPackage("com.google.android.apps.maps");
               startActivity(mapIntent);
           }
       });

       loc10.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               String loc = "Medplus Kollegal";
               Uri uri = Uri.parse("geo:0,0?q=" + Uri.encode(loc));
               Intent mapIntent = new Intent(Intent.ACTION_VIEW, uri);
               mapIntent.setPackage("com.google.android.apps.maps");
               startActivity(mapIntent);
           }
       });





    }
}