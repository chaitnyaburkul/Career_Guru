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

public class Dance_Vocational extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dance_vocational);

        ImageView backmechaa = findViewById(R.id.backdance);

        backmechaa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Dance_Vocational.this, Vocational.class);
                startActivity(intent);
            }
        });

        WebView compweb = findViewById(R.id.webdance);
        String video = "<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/3Znak5Xsj24?si=XC3wZl3vGWWEOmg2\" title=\"YouTube video player\" frameborder=\"0\" allow=\"accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture; web-share\" allowfullscreen></iframe>";
        compweb.loadData(video,"text/html","uef-8");
        compweb.getSettings().setJavaScriptEnabled(true);
        compweb.setWebChromeClient(new WebChromeClient());


        Button comp = findViewById(R.id.clickdance);

        comp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://leverageedu.com/blog/career-in-dancing/");
            }
        });



    }

    private void gotoUrl(String s) {
        Uri uri = Uri.parse(s);
        startActivity(new Intent(Intent.ACTION_VIEW,uri));
    }

}
