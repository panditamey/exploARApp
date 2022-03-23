package com.ameypandit.exploar.subjects;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

import com.ameypandit.exploar.R;
import com.ameypandit.exploar.ict.Ict1Activity;
import com.ameypandit.exploar.sports.Sports1Activity;

public class IctActivity extends AppCompatActivity {
    LinearLayout Ict1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ict);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setTitle("ICT");


        Ict1 = findViewById(R.id.cpu);

        Ict1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(IctActivity.this, Ict1Activity.class);
                startActivity(intent);
            }
        });
    }
}