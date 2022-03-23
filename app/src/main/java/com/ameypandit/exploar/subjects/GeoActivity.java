package com.ameypandit.exploar.subjects;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

import com.ameypandit.exploar.HomeActivity;
import com.ameypandit.exploar.R;
import com.ameypandit.exploar.geography.Geo1Activity;

public class GeoActivity extends AppCompatActivity {
    LinearLayout Geo1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_geo);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setTitle("Geography");


        Geo1 = findViewById(R.id.watercycle);

        Geo1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(GeoActivity.this, Geo1Activity.class);
                startActivity(intent);
            }
        });
    }

}