package com.example.kollegal;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        CardView hos = findViewById(R.id.findHospital);
        hos.setOnClickListener(view -> startActivity(new Intent(MainActivity.this, HospitalActivity.class)));

        CardView phar = findViewById(R.id.findMedical);
        phar.setOnClickListener(View -> startActivity(new Intent(MainActivity.this, pharmacyActivity.class)));

        CardView lab = findViewById(R.id.findLab);
        lab.setOnClickListener(View -> startActivity(new Intent(MainActivity.this, LaboratoriesActivity.class)));

        CardView sch = findViewById(R.id.schemes);
        sch.setOnClickListener(View -> startActivity(new Intent(MainActivity.this, govschemesActivity.class)));

        CardView ft = findViewById(R.id.fitness);
        ft.setOnClickListener(View -> startActivity(new Intent(MainActivity.this, FitnessActivity.class)));

        CardView fh = findViewById(R.id.health);
        fh.setOnClickListener(View -> startActivity(new Intent(MainActivity.this, FreeHealthActivity.class)));
    }

}