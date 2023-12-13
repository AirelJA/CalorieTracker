package com.example.calorietrackerbeta;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class homeworkout extends AppCompatActivity {

    ImageButton btnHWOPushup;
    ImageButton btnHWOBurpess;
    ImageButton btnHWOSitup;
    ImageButton btnHWOMtclimb;
    ImageButton btnBack;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_homeworkout);

        btnBack = findViewById(R.id.backBtnWorkout);
        btnHWOBurpess = findViewById(R.id.btnHWBurpees);
        btnHWOMtclimb = findViewById(R.id.btnHWMtClimb);
        btnHWOPushup = findViewById(R.id.btnHWPushup);
        btnHWOSitup = findViewById(R.id.btnHWSitup);

        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(homeworkout.this, dashboardActivity.class);
                startActivity(intent);
            }
        });

        btnHWOSitup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(homeworkout.this, workoutActivitySitup.class);
                startActivity(intent);
            }
        });

        btnHWOPushup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(homeworkout.this, workoutActivityPushup.class);
                startActivity(intent);
            }
        });

        btnHWOBurpess.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(homeworkout.this, workoutActivityBurpees.class);
                startActivity(intent);
            }
        });

        btnHWOMtclimb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(homeworkout.this, workoutActivityMTClimb.class);
                startActivity(intent);
            }
        });
    }

}
