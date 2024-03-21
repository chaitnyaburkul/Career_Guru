package com.example.career_explorer;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Share_Market extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_share_market);

        ImageView backEsport = findViewById(R.id.backShare);
        backEsport.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Share_Market.this, homepage.class);
                startActivity(intent);
            }
        });

        CardView cardview1 = findViewById(R.id.share1);
        cardview1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Share_Market.this, FinacialAnalyst_shareMarket.class);
                startActivity(intent);
            }
        });

        CardView cardview2 = findViewById(R.id.share2);
        cardview2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Share_Market.this, StockBroker_shareMarket.class);
                startActivity(intent);
            }
        });

        CardView cardview3 = findViewById(R.id.share3);
        cardview3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Share_Market.this, InvestmentBanker_shareMarket.class);
                startActivity(intent);
            }
        });

        CardView cardview4 = findViewById(R.id.share4);
        cardview4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Share_Market.this, PortfolioManager_shareMarket.class);
                startActivity(intent);
            }
        });

        CardView cardview5 = findViewById(R.id.Share5);
        cardview5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Share_Market.this,Trader_shareMarket.class);
                startActivity(intent);
            }
        });

        CardView cardview6 = findViewById(R.id.Share6);
        cardview6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Share_Market.this,ResearchAnalyst_shareMarket.class);
                startActivity(intent);
            }
        });
    }
}