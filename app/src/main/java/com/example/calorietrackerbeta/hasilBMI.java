package com.example.calorietrackerbeta;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class hasilBMI extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_bmical_hasil);

        TextView hasilText = findViewById(R.id.bmiHasilText);
        TextView hasilStatus = findViewById(R.id.textResult);
        TextView hasilRekomen = findViewById(R.id.bmiHasilRec);
        ImageButton btnBack = findViewById(R.id.btnBackBMIHasil);

        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(hasilBMI.this, bmiKalkulator.class);
                startActivity(intent);
            }
        });

        // Retrieve BMI value from intent
        float bmi = getIntent().getFloatExtra("BMI_VALUE", 0.0f);
        hasilText.setText(String.valueOf(bmi));

        // Set recommendation based on BMI
        String TextRekomen = "";

        if (bmi <= 18.4) {
            hasilStatus.setText("Underweight");
            hasilStatus.setTextColor(getResources().getColor(R.color.yellow));
            TextRekomen = "Healthy tips to gain weight: Eat nutrient-dense foods, increase calorie intake, and include protein-rich meals in your diet.";
        } else if (bmi <= 25) {
            hasilStatus.setText("Normal");
            hasilStatus.setTextColor(getResources().getColor(R.color.green));
            TextRekomen = "Healthy tips to maintain weight and stay healthy: Maintain a balanced diet, exercise regularly, and get enough sleep.";
        } else if (bmi <= 30) {
            hasilStatus.setText("Overweight");
            hasilStatus.setTextColor(getResources().getColor(R.color.yellow));
            TextRekomen = "Healthy tips to lose weight: Focus on a balanced diet, engage in regular physical activity, and consider consulting with a nutritionist.";
        } else {
            hasilStatus.setText("Obesity");
            hasilStatus.setTextColor(getResources().getColor(R.color.red));
            TextRekomen = "Healthy tips to handle obesity and be healthy: Adopt a sustainable and balanced lifestyle, consult with healthcare professionals, and consider a personalized fitness plan.";
        }

        hasilRekomen.setText(TextRekomen);
    }
}
