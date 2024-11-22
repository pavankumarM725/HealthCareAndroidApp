package com.example.kollegal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class LaboratoriesActivity extends AppCompatActivity {
     TextView loc1,loc2,loc3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_laboratories);
        loc1 = findViewById(R.id.LOACTION);
        loc2 = findViewById(R.id.LOACTION1);
        loc3 = findViewById(R.id.LOACTION2);

        loc1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String loc = "PRASAD DIAGNOSTIC CENTER";
                Uri uri = Uri.parse("geo:0,0?q=" + Uri.encode(loc));
                Intent mapIntent = new Intent(Intent.ACTION_VIEW, uri);
                mapIntent.setPackage("com.google.android.apps.maps");
                startActivity(mapIntent);
            }
        });
        loc2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String loc = "KOLLEGAL SCANNING & DIAGNOSTIC CENTRE";
                Uri uri = Uri.parse("geo:0,0?q=" + Uri.encode(loc));
                Intent mapIntent = new Intent(Intent.ACTION_VIEW, uri);
                mapIntent.setPackage("com.google.android.apps.maps");
                startActivity(mapIntent);
            }
        });
        loc3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String loc = "Shree Gowri diagnostic centre";
                Uri uri = Uri.parse("geo:0,0?q=" + Uri.encode(loc));
                Intent mapIntent = new Intent(Intent.ACTION_VIEW, uri);
                mapIntent.setPackage("com.google.android.apps.maps");
                startActivity(mapIntent);
            }
        });

    }
}