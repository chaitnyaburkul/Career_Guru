package com.example.career_explorer;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Diploma extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_diploma);

        ImageView back_btn = findViewById(R.id.back_pressss);
        back_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Diploma.this, after10th.class);
                startActivity(intent);
            }
        });


        CardView cardview1 = findViewById(R.id.dip);
        cardview1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Diploma.this, mechanical.class);
                startActivity(intent);
            }
        });

        CardView cardview2 = findViewById(R.id.dip1);
        cardview2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Diploma.this,Computer_Diploma.class);
                startActivity(intent);
            }
        });

        CardView cardview3 = findViewById(R.id.dip2);
        cardview3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Diploma.this, Civil_Diploma.class);
                startActivity(intent);
            }
        });

        CardView cardview4 = findViewById(R.id.dip3);
        cardview4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Diploma.this, Electrical_Diploma.class);
                startActivity(intent);
            }
        });

        CardView cardview5 = findViewById(R.id.dip4);
        cardview5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Diploma.this, Electronics_Diploma.class);
                startActivity(intent);
            }
        });

        CardView cardview6 = findViewById(R.id.dip5);
        cardview6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Diploma.this, Food_Diploma.class);
                startActivity(intent);
            }
        });


    }
}