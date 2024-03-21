package com.example.career_explorer;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Compatitive_exams extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_compatitive_exams);

        ImageView backComp = findViewById(R.id.backCompetitive);

        backComp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Compatitive_exams.this, homepage.class);
                startActivity(intent);
            }
        });

        CardView cardview1 = findViewById(R.id.compe1);
        cardview1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Compatitive_exams.this, UPSC_competitiveExams.class);
                startActivity(intent);
            }
        });

        CardView cardview2 = findViewById(R.id.compe2);
        cardview2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Compatitive_exams.this, MPSC_competitiveExams.class);
                startActivity(intent);
            }
        });

        CardView cardview3 = findViewById(R.id.compe3);
        cardview3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Compatitive_exams.this, Defence_competitiveExams.class);
                startActivity(intent);
            }
        });

        CardView cardview4 = findViewById(R.id.compe4);
        cardview4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Compatitive_exams.this, Railway_competitiveExams.class);
                startActivity(intent);
            }
        });

        CardView cardview5 = findViewById(R.id.compe5);
        cardview5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Compatitive_exams.this, SSC_CGL_competitiveExams.class);
                startActivity(intent);
            }
        });

        CardView cardview6 = findViewById(R.id.compe6);
        cardview6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Compatitive_exams.this, NDA_competitiveExams.class);
                startActivity(intent);
            }
        });

        CardView cardview7 = findViewById(R.id.compe7);
        cardview7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Compatitive_exams.this, CDS_competitiveExams.class);
                startActivity(intent);
            }
        });


    }
}