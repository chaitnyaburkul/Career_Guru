package com.example.career_explorer;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Vocational extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vocational);

        ImageView backVocatinal = findViewById(R.id.backVoca);
        backVocatinal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Vocational.this, after10th.class);
                startActivity(intent);
            }
        });


        CardView cardview1 = findViewById(R.id.voc1);
        cardview1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Vocational.this, eCommerce_Vocational.class);
                startActivity(intent);
            }
        });

        CardView cardview2 = findViewById(R.id.voc2);
        cardview2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Vocational.this,TextileDesign_Vocational.class);
                startActivity(intent);
            }
        });

        CardView cardview3 = findViewById(R.id.voc3);
        cardview3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Vocational.this, Agriculture_Vocational.class);
                startActivity(intent);
            }
        });

        CardView cardview4 = findViewById(R.id.voc4);
        cardview4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Vocational.this, Music_Vocational.class);
                startActivity(intent);
            }
        });

        CardView cardview5 = findViewById(R.id.voc5);
        cardview5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Vocational.this, Dance_Vocational.class);
                startActivity(intent);
            }
        });

        CardView cardview6 = findViewById(R.id.voc6);
        cardview6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Vocational.this, Journalism_Vocational.class);
                startActivity(intent);
            }
        });


    }
}