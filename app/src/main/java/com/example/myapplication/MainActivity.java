package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button; // Importing the standard Android Button
import androidx.activity.ComponentActivity;

public class MainActivity extends ComponentActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Finding the button by its ID and casting it to a Button
        Button button = findViewById(R.id.EnterButton);

        // Set the onClick listener
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Search_Character.class);
                startActivity(intent);
            }
        });

    }
}
