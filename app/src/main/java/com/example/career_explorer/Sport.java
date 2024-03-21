package com.example.career_explorer;



import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class Sport extends AppCompatActivity {

    ImageView bk_btn;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sport);

        bk_btn = findViewById(R.id.bkpss);
        bk_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Sport.this, homepage.class);
                startActivity(intent);
            }
        });

        CardView cardview1 = findViewById(R.id.sp1);
        cardview1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Sport.this, Athletics.class);
                startActivity(intent);
            }
        });

        CardView cardview2 = findViewById(R.id.sp2);
        cardview2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Sport.this, Cricket.class);
                startActivity(intent);
            }
        });

        CardView cardview3 = findViewById(R.id.sp3);
        cardview3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Sport.this, Hockey.class);
                startActivity(intent);
            }
        });

        CardView cardview4 = findViewById(R.id.sp4);
        cardview4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Sport.this, Football.class);
                startActivity(intent);
            }
        });

        CardView cardview5 = findViewById(R.id.sp5);
        cardview5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Sport.this, Badminton.class);
                startActivity(intent);
            }
        });

        CardView cardview6 = findViewById(R.id.sp6);
        cardview6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Sport.this, Kabbadi.class);
                startActivity(intent);
            }
        });
    }
}