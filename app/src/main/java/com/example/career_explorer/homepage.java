package com.example.career_explorer;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Switch;

import androidx.appcompat.widget.Toolbar;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationView;

public class homepage extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_homepage);

        BottomNavigationView bottomNavigationView = findViewById(R.id.bottom_navigation);

        bottomNavigationView.setSelectedItemId(R.id.nav_home);

        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @SuppressLint("NonConstantResourceId")
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item)
            {

                int id=item.getItemId();
                if( id == R.id.nav_home) {

                    return true;
                }
                if( id == R.id.nav_feedback) {
                    startActivity(new Intent(getApplicationContext(), feedback_activity.class));
                    overridePendingTransition(0,0);
                    return true;
                }
                if( id == R.id.nav_aboutus) {
                    startActivity(new Intent(getApplicationContext(), AboutUs.class));
                    overridePendingTransition(0, 0);
                    return true;
                }



                return false;
            }
        });

















        CardView cardView1 = findViewById(R.id.after_10);
        cardView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(homepage.this, after10th.class);
                startActivity(intent);
            }
        });

        CardView cardView2 = findViewById(R.id.after_12);
        cardView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(homepage.this, after_12.class);
                startActivity(intent);

            }
        });

        CardView cardView3 = findViewById(R.id.after_Graduation);
        cardView3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(homepage.this, Graduation.class);
                startActivity(intent);

            }
        });

        CardView cardView4 = findViewById(R.id.after_CompetitiveExams);
        cardView4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(homepage.this, Compatitive_exams.class);
                startActivity(intent);
            }
        });

        CardView cardView5 = findViewById(R.id.after_Sports);
        cardView5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(homepage.this, Sport.class);
                startActivity(intent);
            }
        });

        CardView cardView6 = findViewById(R.id.after_Esports);
        cardView6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(homepage.this, ESports.class);
                startActivity(intent);
            }
        });

        CardView cardView7 = findViewById(R.id.after_shareMarket);
        cardView7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(homepage.this, Share_Market.class);
                startActivity(intent);
            }
        });

        CardView cardView8 = findViewById(R.id.SocialMediaInfluencer);
        cardView8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(homepage.this, SocialMedia_Influencer.class);
                startActivity(intent);
            }
        });





    }
}