package com.example.kollegal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class HospitalActivity extends AppCompatActivity {
    TextView loc2,loc1,loc3,loc4,loc5,loc6,loc7,loc8,loc9,loc10;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hospital);
        loc2 = findViewById(R.id.LOACTION1);
        loc1 = findViewById(R.id.LOACTION);
        loc3 = findViewById(R.id.LOACTION2);
        loc4 = findViewById(R.id.LOACTION3);
        loc5 = findViewById(R.id.LOACTION4);
        loc6 = findViewById(R.id.LOACTION5);
        loc7 = findViewById(R.id.LOACTION6);
        loc8 = findViewById(R.id.LOACTION7);
        loc9 = findViewById(R.id.LOACTION8);
        loc10 = findViewById(R.id.LOACTION9);
        loc2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String loc = "Janani Hospital Kollegala";
                Uri uri = Uri.parse("geo:0,0?q=" + Uri.encode(loc));
                Intent mapIntent = new Intent(Intent.ACTION_VIEW, uri);
                mapIntent.setPackage("com.google.android.apps.maps");
                startActivity(mapIntent);
            }
        });

        loc1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String loc = "ಕೊಳ್ಳೇಗಾಲ ಸರಕಾರಿ ಆಸ್ಪತ್ರೆ";
                Uri uri = Uri.parse("geo:0,0?q=" + Uri.encode(loc));
                Intent mapIntent = new Intent(Intent.ACTION_VIEW, uri);
                mapIntent.setPackage("com.google.android.apps.maps");
                startActivity(mapIntent);
            }
        });
        loc3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String loc = "Shanthi Nursing Home Kollegala";
                Uri uri = Uri.parse("geo:0,0?q=" + Uri.encode(loc));
                Intent mapIntent = new Intent(Intent.ACTION_VIEW, uri);
                mapIntent.setPackage("com.google.android.apps.maps");
                startActivity(mapIntent);
            }
        });
        loc4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String loc = "Vijayalakshmi Nursing Home Kollegala";
                Uri uri = Uri.parse("geo:0,0?q=" + Uri.encode(loc));
                Intent mapIntent = new Intent(Intent.ACTION_VIEW, uri);
                mapIntent.setPackage("com.google.android.apps.maps");
                startActivity(mapIntent);
            }
        });
        loc5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String loc = "Mudduveerappa Memorial Hospital";
                Uri uri = Uri.parse("geo:0,0?q=" + Uri.encode(loc));
                Intent mapIntent = new Intent(Intent.ACTION_VIEW, uri);
                mapIntent.setPackage("com.google.android.apps.maps");
                startActivity(mapIntent);
            }
        });
        loc6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String loc = "R K Hospital Kollegal";
                Uri uri = Uri.parse("geo:0,0?q=" + Uri.encode(loc));
                Intent mapIntent = new Intent(Intent.ACTION_VIEW, uri);
                mapIntent.setPackage("com.google.android.apps.maps");
                startActivity(mapIntent);
            }
        });
      loc7.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View view) {
              String loc = "A.V.S Hopital kollegal";
              Uri uri = Uri.parse("geo:0,0?q=" + Uri.encode(loc));
              Intent mapIntent = new Intent(Intent.ACTION_VIEW, uri);
              mapIntent.setPackage("com.google.android.apps.maps");
              startActivity(mapIntent);
          }
      });
      loc8.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View view) {
              String loc = "Nanjappa Eye Hospital Kollegal";
              Uri uri = Uri.parse("geo:0,0?q=" + Uri.encode(loc));
              Intent mapIntent = new Intent(Intent.ACTION_VIEW, uri);
              mapIntent.setPackage("com.google.android.apps.maps");
              startActivity(mapIntent);
          }
      });
      loc9.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View view) {
              String loc = "Siddartha Dental Clinic Kollegal";
              Uri uri = Uri.parse("geo:0,0?q=" + Uri.encode(loc));
              Intent mapIntent = new Intent(Intent.ACTION_VIEW, uri);
              mapIntent.setPackage("com.google.android.apps.maps");
              startActivity(mapIntent);
          }
      });
      loc10.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View view) {
              String loc = "KK Orthopedic Clinic Kollegal";
              Uri uri = Uri.parse("geo:0,0?q=" + Uri.encode(loc));
              Intent mapIntent = new Intent(Intent.ACTION_VIEW, uri);
              mapIntent.setPackage("com.google.android.apps.maps");
              startActivity(mapIntent);
          }
      });






    }
}