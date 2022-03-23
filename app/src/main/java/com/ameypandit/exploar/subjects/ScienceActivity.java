package com.ameypandit.exploar.subjects;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

import com.ameypandit.exploar.R;
import com.ameypandit.exploar.geography.Geo1Activity;
import com.ameypandit.exploar.science.Science1Activity;

public class ScienceActivity extends AppCompatActivity {
    LinearLayout Sci1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_science);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setTitle("Science");


        Sci1 = findViewById(R.id.cell);

        Sci1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ScienceActivity.this, Science1Activity.class);
                startActivity(intent);
            }
        });
    }
}