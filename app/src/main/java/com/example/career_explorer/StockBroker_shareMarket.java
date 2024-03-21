package com.example.career_explorer;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.ImageView;

public class StockBroker_shareMarket extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stock_broker_share_market);

        ImageView backmechaa = findViewById(R.id.backsbroker);

        backmechaa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(StockBroker_shareMarket.this, Share_Market.class);
                startActivity(intent);
            }
        });

        WebView compweb = findViewById(R.id.websbroker);
        String video = "<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/hpEv7i1bJXs?si=YW_1CfAl8i9oxPuB\" title=\"YouTube video player\" frameborder=\"0\" allow=\"accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture; web-share\" allowfullscreen></iframe>";
        compweb.loadData(video,"text/html","uef-8");
        compweb.getSettings().setJavaScriptEnabled(true);
        compweb.setWebChromeClient(new WebChromeClient());


        Button comp = findViewById(R.id.clicksbroker);

        comp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("http://tutorialsroot.com/career/stock-broker-kaise-bane.html");
            }
        });



    }

    private void gotoUrl(String s) {
        Uri uri = Uri.parse(s);
        startActivity(new Intent(Intent.ACTION_VIEW,uri));
    }

}
