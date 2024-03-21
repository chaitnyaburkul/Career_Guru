package com.example.career_explorer;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class ShortTerm_Courses extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_short_term_courses);

       ImageView backShortTerm = findViewById(R.id.backShort);

        backShortTerm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ShortTerm_Courses.this, after10th.class);
                startActivity(intent);
            }
        });

        CardView cardview1 = findViewById(R.id.short1);
        cardview1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ShortTerm_Courses.this, Tally_shortTerm.class);
                startActivity(intent);
            }
        });

        CardView cardview2 = findViewById(R.id.short2);
        cardview2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ShortTerm_Courses.this, Graphics_shortTerm.class);
                startActivity(intent);
            }
        });

        CardView cardview3 = findViewById(R.id.short3);
        cardview3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ShortTerm_Courses.this, Animation_shortTerm.class);
                startActivity(intent);
            }
        });

        CardView cardview4 = findViewById(R.id.short4);
        cardview4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ShortTerm_Courses.this, WebDesign_shortTerm.class);
                startActivity(intent);
            }
        });

        CardView cardview5 = findViewById(R.id.short5);
        cardview5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ShortTerm_Courses.this, MSCIT_shortTerm.class);
                startActivity(intent);
            }
        });

        CardView cardview6 = findViewById(R.id.short6);
        cardview6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ShortTerm_Courses.this, CyberSecurity_shortTerm.class);
                startActivity(intent);
            }
        });
    }
}