package com.example.career_explorer;

import static com.example.career_explorer.R.id.backp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Class_XI_XII extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_class_xi_xii);

        ImageView backB1 = findViewById(R.id.backp);

        backB1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Class_XI_XII.this, after10th.class);
                startActivity(intent);
            }
        });

        CardView cardview1 = findViewById(R.id.xi11);
        cardview1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Class_XI_XII.this, science_class_xi_xii.class);
                startActivity(intent);
            }
        });

        CardView cardview2 = findViewById(R.id.xi12);
        cardview2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Class_XI_XII.this,arts_class_xi_xii.class);
                startActivity(intent);
            }
        });

        CardView cardview3 = findViewById(R.id.xi13);
        cardview3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Class_XI_XII.this, commerce_class_xi_xii.class);
                startActivity(intent);
            }
        });

        CardView cardview4 = findViewById(R.id.xi14);
        cardview4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Class_XI_XII.this, mcvc_class_xi_xii.class);
                startActivity(intent);
            }
        });



    }
}