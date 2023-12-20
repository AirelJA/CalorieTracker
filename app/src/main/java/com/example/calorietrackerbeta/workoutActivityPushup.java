package com.example.calorietrackerbeta;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class workoutActivityPushup extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_hopushup);

        ImageButton btnBack = findViewById(R.id.backBtnPushup);

        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(workoutActivityPushup.this, homeworkout.class);
                startActivity(intent);
            }
        });

    }


}
