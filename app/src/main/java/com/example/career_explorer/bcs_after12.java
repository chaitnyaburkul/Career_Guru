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

public class bcs_after12 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bcs_after12);

        ImageView backmechaa = findViewById(R.id.backbcs);

        backmechaa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(bcs_after12.this, after_12.class);
                startActivity(intent);
            }
        });

        WebView bcsweb = findViewById(R.id.webbcs);
        String video = "<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/b6j8xxj7NdU?si=FJF0SKLzNkSaxy0I\" title=\"YouTube video player\" frameborder=\"0\" allow=\"accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture; web-share\" allowfullscreen></iframe>";
        bcsweb.loadData(video,"text/html","uef-8");
        bcsweb.getSettings().setJavaScriptEnabled(true);
        bcsweb.setWebChromeClient(new WebChromeClient());



        Button bcsss = findViewById(R.id.clickbcs);

        bcsss.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://www.collegesearch.in/articles/bcs-bachelor-of-computer-science-crs");
            }
        });



    }

    private void gotoUrl(String s) {
        Uri uri = Uri.parse(s);
        startActivity(new Intent(Intent.ACTION_VIEW,uri));
    }
}
