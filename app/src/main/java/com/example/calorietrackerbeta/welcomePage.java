package com.example.calorietrackerbeta;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class welcomePage extends AppCompatActivity {

    //deklarai button
    Button btnStarted;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_welcomepage);

        btnStarted = findViewById(R.id.getStarted);

        btnStarted.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(welcomePage.this, dashboardActivity.class);
                startActivity(intent);
            }
        });
    }
}
