package com.ameypandit.exploar;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

import com.ameypandit.exploar.subjects.GeoActivity;
import com.ameypandit.exploar.subjects.HistoryActivity;
import com.ameypandit.exploar.subjects.IctActivity;
import com.ameypandit.exploar.subjects.MathsActivity;
import com.ameypandit.exploar.subjects.ScienceActivity;
import com.ameypandit.exploar.subjects.SportsActivity;

public class HomeActivity extends AppCompatActivity {
    LinearLayout History;
    LinearLayout Geography;
    LinearLayout Science;
    LinearLayout Maths;
    LinearLayout Sports;
    LinearLayout ICT;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        History = findViewById(R.id.historyBtn);
        Geography = findViewById(R.id.geoBtn);
        Science = findViewById(R.id.scienceBtn);
        Maths = findViewById(R.id.mathsBtn);
        Sports = findViewById(R.id.sportsBtn);
        ICT = findViewById(R.id.ictBtn);

        History.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomeActivity.this, HistoryActivity.class);
                startActivity(intent);
            }
        });
        Geography.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomeActivity.this, GeoActivity.class);
                startActivity(intent);
            }
        });
        Science.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomeActivity.this, ScienceActivity.class);
                startActivity(intent);
            }
        });
        Maths.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomeActivity.this, MathsActivity.class);
                startActivity(intent);
            }
        });
        Sports.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomeActivity.this, SportsActivity.class);
                startActivity(intent);
            }
        });
        ICT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomeActivity.this, IctActivity.class);
                startActivity(intent);
            }
        });
    }
}