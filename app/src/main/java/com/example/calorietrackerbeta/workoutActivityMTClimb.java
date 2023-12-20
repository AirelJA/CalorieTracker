package com.example.calorietrackerbeta;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class workoutActivityMTClimb extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_homtclimb);

        ImageButton btnBack = findViewById(R.id.backBtnMtClimb);

        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(workoutActivityMTClimb.this, homeworkout.class);
                startActivity(intent);
            }
        });
    }
}
