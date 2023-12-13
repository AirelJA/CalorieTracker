package com.example.calorietrackerbeta;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.Group;

public class dashboardActivity extends AppCompatActivity {

    Group btnHitungCal;
    Button btnMenuHitungCal;
    ImageView btnImgMenuHitungCal;
    Group btnHomeworkout;
    Button btnMenuHWO;
    ImageView btnImgMenuHWO;
    Group btnBmical;
    Button btnMenuBMI;
    ImageView btnImgMenuBMI;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_dashboard);

        btnHitungCal = findViewById(R.id.hitungKal);
        btnMenuHitungCal = findViewById(R.id.buttonCalMenu);
        btnImgMenuHitungCal = findViewById(R.id.buttonCalMenuImg);
        btnHomeworkout = findViewById(R.id.homeWO);
        btnMenuHWO = findViewById(R.id.buttonHWOMenu);
        btnImgMenuHWO = findViewById(R.id.buttonWorkoutMenuImg);
        btnBmical = findViewById(R.id.bmiKal);
        btnMenuBMI = findViewById(R.id.buttonBMIMenu);
        btnImgMenuBMI = findViewById(R.id.buttonBMIMenuImg);

        btnHitungCal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(dashboardActivity.this, hitungCal.class);
                startActivity(intent);
            }
        });

        btnMenuHitungCal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(dashboardActivity.this, hitungCal.class);
                startActivity(intent);
            }
        });

        btnImgMenuHitungCal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(dashboardActivity.this, hitungCal.class);
                startActivity(intent);
            }
        });

        btnBmical.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(dashboardActivity.this, bmiKalkulator.class);
                startActivity(intent);
            }
        });

        btnMenuBMI.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(dashboardActivity.this, bmiKalkulator.class);
                startActivity(intent);
            }
        });

        btnImgMenuBMI.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(dashboardActivity.this, bmiKalkulator.class);
                startActivity(intent);
            }
        });

        btnHomeworkout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(dashboardActivity.this, homeworkout.class);
                startActivity(intent);
            }
        });

        btnMenuHWO.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(dashboardActivity.this, homeworkout.class);
                startActivity(intent);
            }
        });

        btnImgMenuHWO.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(dashboardActivity.this, homeworkout.class);
                startActivity(intent);
            }
        });
    }
}
