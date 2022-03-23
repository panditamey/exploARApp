package com.ameypandit.exploar.subjects;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

import com.ameypandit.exploar.R;
import com.ameypandit.exploar.maths.Maths1Activity;
import com.ameypandit.exploar.science.Science1Activity;

public class MathsActivity extends AppCompatActivity {
    LinearLayout Maths1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maths);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setTitle("Maths");


        Maths1 = findViewById(R.id.maths1);

        Maths1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MathsActivity.this, Maths1Activity.class);
                startActivity(intent);
            }
        });
    }
}