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

public class Badminton extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_badminton);

        ImageView backmechaa = findViewById(R.id.backbadminton);

        backmechaa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Badminton.this, Sport.class);
                startActivity(intent);
            }
        });

        WebView badweb = findViewById(R.id.webbadmionton);
        String video = "<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/gWJxF2EkacI?si=3t-grCULTLkyYzL7\" title=\"YouTube video player\" frameborder=\"0\" allow=\"accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture; web-share\" allowfullscreen></iframe>";
        badweb.loadData(video,"text/html","uef-8");
        badweb.getSettings().setJavaScriptEnabled(true);
        badweb.setWebChromeClient(new WebChromeClient());



        Button bcommm = findViewById(R.id.clickbadminton);
        bcommm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://en.wikipedia.org/wiki/Badminton");
            }
        });



    }

    private void gotoUrl(String s) {
        Uri uri = Uri.parse(s);
        startActivity(new Intent(Intent.ACTION_VIEW,uri));
    }
}

