package com.ameypandit.exploar.subjects;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

import com.ameypandit.exploar.R;
import com.ameypandit.exploar.geography.Geo1Activity;
import com.ameypandit.exploar.history.History1Activity;

public class HistoryActivity extends AppCompatActivity {
    LinearLayout His1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_history);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setTitle("History");


        His1 = findViewById(R.id.colosseum);

        His1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HistoryActivity.this, History1Activity.class);
                startActivity(intent);
            }
        });
    }
}