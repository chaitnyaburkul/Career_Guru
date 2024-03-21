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

public class BusinessAnalyst_Graduation extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_business_analyst_graduation);

        ImageView backmechaa = findViewById(R.id.backbussiana);

        backmechaa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(BusinessAnalyst_Graduation.this, Graduation.class);
                startActivity(intent);
            }
        });

        WebView busiweb = findViewById(R.id.webbusiness);
        String video = "<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/FP0rOvPwMdQ?si=aYL6i-5aqabwXgvG\" title=\"YouTube video player\" frameborder=\"0\" allow=\"accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture; web-share\" allowfullscreen></iframe>";
        busiweb.loadData(video,"text/html","uef-8");
        busiweb.getSettings().setJavaScriptEnabled(true);
        busiweb.setWebChromeClient(new WebChromeClient());



        Button busi = findViewById(R.id.clickbusiness);

        busi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://www.forbes.com/advisor/in/education/become-a-business-analyst/");
            }
        });



    }

    private void gotoUrl(String s) {
        Uri uri = Uri.parse(s);
        startActivity(new Intent(Intent.ACTION_VIEW,uri));
    }
}

