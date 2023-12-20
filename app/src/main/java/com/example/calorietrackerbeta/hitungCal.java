package com.example.calorietrackerbeta;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

import com.example.calorietrackerbeta.R.id;

public class hitungCal extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_hitungcalori);

        ImageButton btnBack = findViewById(R.id.btnBackHitungKal);

        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(hitungCal.this, dashboardActivity.class);
                startActivity(intent);
            }
        });
    }
}
