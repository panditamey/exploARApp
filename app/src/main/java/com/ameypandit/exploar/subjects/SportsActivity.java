package com.ameypandit.exploar.subjects;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

import com.ameypandit.exploar.R;
import com.ameypandit.exploar.geography.Geo1Activity;
import com.ameypandit.exploar.sports.Sports1Activity;

public class SportsActivity extends AppCompatActivity {
    LinearLayout Sports1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sports);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setTitle("Sports");


        Sports1 = findViewById(R.id.basketball);

        Sports1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SportsActivity.this, Sports1Activity.class);
                startActivity(intent);
            }
        });
    }
}