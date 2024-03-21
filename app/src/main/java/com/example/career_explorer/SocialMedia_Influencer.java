package com.example.career_explorer;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class SocialMedia_Influencer extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_social_media_influencer);

        ImageView backEsport = findViewById(R.id.backSocial);
        backEsport.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SocialMedia_Influencer.this, homepage.class);
                startActivity(intent);
            }
        });

        CardView cardview1 = findViewById(R.id.social1);
        cardview1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SocialMedia_Influencer.this, ContentCreation_Influencer.class);
                startActivity(intent);
            }
        });

        CardView cardview2 = findViewById(R.id.social2);
        cardview2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SocialMedia_Influencer.this, Collaboration_Influencer.class);
                startActivity(intent);
            }
        });

        CardView cardview3 = findViewById(R.id.social3);
        cardview3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SocialMedia_Influencer.this, InstagramDomination_Influencer.class);
                startActivity(intent);
            }
        });

        CardView cardview4 = findViewById(R.id.social4);
        cardview4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SocialMedia_Influencer.this, MonitoringSocial_Influencer.class);
                startActivity(intent);
            }
        });

        CardView cardview5 = findViewById(R.id.social5);
        cardview5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SocialMedia_Influencer.this,LocalSEO_Influencer.class);
                startActivity(intent);
            }
        });

        CardView cardview6 = findViewById(R.id.social6);
        cardview6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SocialMedia_Influencer.this,ContentMarketing_Influencer.class);
                startActivity(intent);
            }
        });
    }
}