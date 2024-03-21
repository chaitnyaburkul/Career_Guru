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

public class FinacialAnalyst_shareMarket extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_finacial_analyst_share_market);

        ImageView backmechaa = findViewById(R.id.backfa);

        backmechaa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(FinacialAnalyst_shareMarket.this, Share_Market.class);
                startActivity(intent);
            }
        });

        WebView compweb = findViewById(R.id.webfinacial);
        String video = "<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/E0w5tN77vPk?si=7FpGTeKeohRu9oED\" title=\"YouTube video player\" frameborder=\"0\" allow=\"accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture; web-share\" allowfullscreen></iframe>" ;
        compweb.loadData(video,"text/html","uef-8");
        compweb.getSettings().setJavaScriptEnabled(true);
        compweb.setWebChromeClient(new WebChromeClient());


        Button comp = findViewById(R.id.clickfinacial);

        comp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://imarticus.org/certified-investment-banking-operations-program/?utm_source=bing&utm_medium=cpc&utm_campaign=686908043&utm_campaignname=CIBOP_PanIndia_retail_Bing_botf_NBsearch&utm_term=financial%20analyst%20course&utm_adgroup=Investment%20Banking&utm_campaigntype=search&msclkid=7c0d35f01d0c1ac6d12250364a62e6b9");
            }
        });



    }

    private void gotoUrl(String s) {
        Uri uri = Uri.parse(s);
        startActivity(new Intent(Intent.ACTION_VIEW,uri));
    }

}
