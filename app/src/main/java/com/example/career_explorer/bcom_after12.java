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

public class bcom_after12 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bcom_after12);

        ImageView backmechaa = findViewById(R.id.backbcom);

        backmechaa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(bcom_after12.this, after_12.class);
                startActivity(intent);
            }
        });

        WebView bcomweb = findViewById(R.id.webbcom);
        String video = "<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/QFVw4-5779I?si=-vHV4J1w1JsUkvBY\" title=\"YouTube video player\" frameborder=\"0\" allow=\"accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture; web-share\" allowfullscreen></iframe>";
        bcomweb.loadData(video,"text/html","uef-8");
        bcomweb.getSettings().setJavaScriptEnabled(true);
        bcomweb.setWebChromeClient(new WebChromeClient());



        Button bcommm = findViewById(R.id.clickbcom);
        bcommm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://collegedunia.com/courses/bachelor-of-commerce-bcom");
            }
        });



    }

    private void gotoUrl(String s) {
        Uri uri = Uri.parse(s);
        startActivity(new Intent(Intent.ACTION_VIEW,uri));
    }
}

