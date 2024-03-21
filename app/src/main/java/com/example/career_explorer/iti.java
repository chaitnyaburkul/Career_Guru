package com.example.career_explorer;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class iti extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_iti);

        ImageView backiti1 = findViewById(R.id.backiti);
        backiti1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(iti.this,after10th.class);
                startActivity(intent);
            }
        });

        CardView cardview1 = findViewById(R.id.iti1);
        cardview1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(iti.this, Electrician_iti.class);
                startActivity(intent);
            }
        });

        CardView cardview2 = findViewById(R.id.iti2);
        cardview2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(iti.this, Plumber_iti.class);
                startActivity(intent);
            }
        });

        CardView cardview3 = findViewById(R.id.iti3);
        cardview3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(iti.this, Welder_iti.class);
                startActivity(intent);
            }
        });

        CardView cardview4 = findViewById(R.id.iti4);
        cardview4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(iti.this, Fitter_iti.class);
                startActivity(intent);
            }
        });

        CardView cardview5 = findViewById(R.id.iti5);
        cardview5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(iti.this, COPA_iti.class);
                startActivity(intent);
            }
        });

        CardView cardview6 = findViewById(R.id.iti6);
        cardview6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(iti.this, AC_mechanic_iti.class);
                startActivity(intent);
            }
        });
    }
}