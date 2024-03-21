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

public class InvestmentBanker_shareMarket extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_investment_banker_share_market);

        ImageView backmechaa = findViewById(R.id.backinvestmentbanker);

        backmechaa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(InvestmentBanker_shareMarket.this, Share_Market.class);
                startActivity(intent);
            }
        });

        WebView compweb = findViewById(R.id.webinvest);
        String video = "<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/bd2YlYE2DFY?si=qRRtMe5oeV9sHmdP\" title=\"YouTube video player\" frameborder=\"0\" allow=\"accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture; web-share\" allowfullscreen></iframe>";
        compweb.loadData(video,"text/html","uef-8");
        compweb.getSettings().setJavaScriptEnabled(true);
        compweb.setWebChromeClient(new WebChromeClient());


        Button comp = findViewById(R.id.clickunvest);

        comp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://imarticus.org/certified-investment-banking-operations-program/?utm_source=bing&utm_medium=cpc&utm_campaign=686908043&utm_campaignname=CIBOP_PanIndia_retail_Bing_botf_NBsearch&utm_term=how%20to%20become%20an%20investment%20banker&utm_adgroup=Investment%20Banking&utm_campaigntype=search&msclkid=7f56b0c643591578e540d501544a26d5");
            }
        });



    }

    private void gotoUrl(String s) {
        Uri uri = Uri.parse(s);
        startActivity(new Intent(Intent.ACTION_VIEW,uri));
    }

}
