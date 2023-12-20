package com.example.calorietrackerbeta;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class workoutActivitySitup extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_hositup);

        ImageButton btnBack = findViewById(R.id.backBtnSitup);

        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(workoutActivitySitup.this, homeworkout.class);
                startActivity(intent);
            }
        });
    }
}
