package com.example.calorietrackerbeta;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.SearchView;
import androidx.appcompat.widget.Toolbar;

public class addKalori extends AppCompatActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_calkalori);

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        SearchView searchView = findViewById(R.id.searchView);

        // Set up SearchView listener and handle search logic
        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {
                // Handle search submission
                return true;
            }

            @Override
            public boolean onQueryTextChange(String newText) {
                // Handle search text change
                return true;
            }
        });
    }
}
