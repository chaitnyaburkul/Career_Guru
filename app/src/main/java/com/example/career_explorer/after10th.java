package com.example.career_explorer;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class after10th extends AppCompatActivity
{

    ImageView back_btn;




    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_after10th);

        back_btn = findViewById(R.id.back_pressss);

        back_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(after10th.this, homepage.class);
                startActivity(intent);
            }
        });

        CardView cardview1 = findViewById(R.id.card_1);
        cardview1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(after10th.this, Diploma.class);
                startActivity(intent);
            }
        });

        CardView cardview2 = findViewById(R.id.card_2);
        cardview2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(after10th.this, Class_XI_XII.class);
                startActivity(intent);
            }
        });

        CardView cardview3 = findViewById(R.id.card_3);
        cardview3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(after10th.this, iti.class);
                startActivity(intent);
            }
        });

        CardView cardview4 = findViewById(R.id.card_4);
        cardview4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(after10th.this, Paramedical.class);
                startActivity(intent);
            }
        });

        CardView cardview5 = findViewById(R.id.card_5);
        cardview5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(after10th.this, Vocational.class);
                startActivity(intent);
            }
        });

        CardView cardview6 = findViewById(R.id.card_6);
        cardview6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(after10th.this, ShortTerm_Courses.class);
                startActivity(intent);
            }
        });

    }
}