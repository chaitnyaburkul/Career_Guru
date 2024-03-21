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

public class MarketingExecutive_Esports extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_marketing_executive_esports);

        ImageView backmechaa = findViewById(R.id.backmarexe);

        backmechaa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MarketingExecutive_Esports.this, ESports.class);
                startActivity(intent);
            }
        });

        WebView compweb = findViewById(R.id.webmarexe);
        String video = "<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/PAtnEoQSHLY?si=ztkfdHHFAOqI-kRJ\" title=\"YouTube video player\" frameborder=\"0\" allow=\"accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture; web-share\" allowfullscreen></iframe>";
        compweb.loadData(video,"text/html","uef-8");
        compweb.getSettings().setJavaScriptEnabled(true);
        compweb.setWebChromeClient(new WebChromeClient());


        Button comp = findViewById(R.id.clickmarexe);

        comp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://www.careers360.com/careers/marketing-executive#:~:text=A%20Marketing%20Executive%20is%20a%20professional%20involved%20in,public%20relations%2C%20organising%20events%2C%20advertising%2C%20research%20and%20sponsorship.");
            }
        });



    }

    private void gotoUrl(String s) {
        Uri uri = Uri.parse(s);
        startActivity(new Intent(Intent.ACTION_VIEW,uri));
    }

}

