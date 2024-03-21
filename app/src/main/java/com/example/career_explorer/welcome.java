package com.example.career_explorer;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class welcome extends AppCompatActivity {

    Button b1, b2, b3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);

        b1 = findViewById(R.id.bu);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(welcome.this, signin.class);
                startActivity(i);
            }
        });

        b2 = findViewById(R.id.but);
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(welcome.this, signup.class);
                startActivity(i);
            }
        });

        b3 = findViewById(R.id.butt);
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // When the "Guest" button is clicked, go directly to the homepage activity
                Intent i = new Intent(welcome.this, homepage.class);
                startActivity(i);
            }
        });


    }
}