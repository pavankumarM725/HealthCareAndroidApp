package com.example.kollegal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class FreeHealthActivity extends AppCompatActivity {
    TextView tv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_free_health);
        tv = findViewById(R.id.ADDRESS);
        tv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url = "rid3181.rotaryindia.org/ClubFinderDetail.aspx?grp=1480";
                Uri u = Uri.parse("http://"+url);
                Intent i = new Intent(Intent.ACTION_VIEW,u);
                startActivity(i);
            }
        });

    }
}