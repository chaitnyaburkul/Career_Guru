package com.example.career_explorer;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class after_12 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_after12);

        ImageView back_btn = findViewById(R.id.back_pressss);

        back_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(after_12.this, homepage.class);
                startActivity(intent);
            }
        });

        CardView cardview1 = findViewById(R.id.xi1);
        cardview1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(after_12.this, law_after12.class);
                startActivity(intent);
            }
        });

        CardView cardview2 = findViewById(R.id.xi2);
        cardview2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(after_12.this, archiuetecture_after12.class);
                startActivity(intent);
            }
        });

        CardView cardview3 = findViewById(R.id.xi3);
        cardview3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(after_12.this, pharmacy_after12.class);
                startActivity(intent);
            }
        });

        CardView cardview4 = findViewById(R.id.xi4);
        cardview4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(after_12.this, ba_after12.class);
                startActivity(intent);
            }
        });

        CardView cardview5 = findViewById(R.id.xi5);
        cardview5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(after_12.this, bcom_after12.class);
                startActivity(intent);
            }
        });

        CardView cardview6 = findViewById(R.id.xi6);
        cardview6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(after_12.this, bcs_after12.class);
                startActivity(intent);
            }
        });

    }
}