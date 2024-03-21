package com.example.career_explorer;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Paramedical extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_paramedical);

        ImageView back_para = findViewById(R.id.backpara);

        back_para.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Paramedical.this, after10th.class);
                startActivity(intent);
            }
        });

        CardView cardview1 = findViewById(R.id.para1);
        cardview1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Paramedical.this, DLMT_Paramedical.class);
                startActivity(intent);
            }
        });

        CardView cardview2 = findViewById(R.id.para2);
        cardview2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Paramedical.this, DHFM_Paramedical.class);
                startActivity(intent);
            }
        });



        CardView cardview5 = findViewById(R.id.para5);
        cardview5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Paramedical.this, Health_Inspector_Paramedical.class);
                startActivity(intent);
            }
        });

        CardView cardview6 = findViewById(R.id.para6);
        cardview6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Paramedical.this, OT_Paramedical.class);
                startActivity(intent);
            }
        });

    }
}