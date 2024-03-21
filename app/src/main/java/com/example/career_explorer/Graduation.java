package com.example.career_explorer;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Graduation extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_graduation);

        ImageView backComp = findViewById(R.id.backGraduation);

        backComp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Graduation.this, homepage.class);
                startActivity(intent);
            }
        });

        CardView cardview1 = findViewById(R.id.AG1);
        cardview1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Graduation.this, DigitalMarketing_Graduation.class);
                startActivity(intent);
            }
        });

        CardView cardview2 = findViewById(R.id.AG2);
        cardview2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Graduation.this, MBA_Graduation.class);
                startActivity(intent);
            }
        });

        CardView cardview3 = findViewById(R.id.AG3);
        cardview3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Graduation.this, DataScience_Graduation.class);
                startActivity(intent);
            }
        });

        CardView cardview4 = findViewById(R.id.AG4);
        cardview4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Graduation.this, M_Tech_Graduation.class);
                startActivity(intent);
            }
        });

        CardView cardview5 = findViewById(R.id.AG5);
        cardview5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Graduation.this,BusinessAnalyst_Graduation.class);
                startActivity(intent);
            }
        });

        CardView cardview6 = findViewById(R.id.AG6);
        cardview6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Graduation.this, HRmanager_Graduation.class);
                startActivity(intent);
            }
        });

        CardView cardview7 = findViewById(R.id.AG7);
        cardview7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Graduation.this, CA_Graduation.class);
                startActivity(intent);
            }
        });


    }
}