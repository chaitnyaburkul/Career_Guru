package com.example.career_explorer;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class ESports extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_esports);

        ImageView backEsport = findViewById(R.id.backEsports);
        backEsport.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ESports.this, homepage.class);
                startActivity(intent);
            }
        });

        CardView cardview1 = findViewById(R.id.Es1);
        cardview1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ESports.this, GameDesign_Esports.class);
                startActivity(intent);
            }
        });

        CardView cardview2 = findViewById(R.id.Es2);
        cardview2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ESports.this, CommunityManager_Esports.class);
                startActivity(intent);
            }
        });

        CardView cardview3 = findViewById(R.id.Es3);
        cardview3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ESports.this, EventManager_Esports.class);
                startActivity(intent);
            }
        });

        CardView cardview4 = findViewById(R.id.Es4);
        cardview4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ESports.this, EsportsProducer_Esports.class);
                startActivity(intent);
            }
        });

        CardView cardview5 = findViewById(R.id.Es5);
        cardview5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ESports.this,ProductManager_Esports.class);
                startActivity(intent);
            }
        });

        CardView cardview6 = findViewById(R.id.Es6);
        cardview6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ESports.this,MarketingExecutive_Esports.class);
                startActivity(intent);
            }
        });
    }
}