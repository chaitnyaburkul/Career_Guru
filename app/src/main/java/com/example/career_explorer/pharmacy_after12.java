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

public class pharmacy_after12 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pharmacy_after12);

        ImageView backmechaa = findViewById(R.id.backpharmacy);

        backmechaa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(pharmacy_after12.this, after_12.class);
                startActivity(intent);
            }
        });

        WebView compweb = findViewById(R.id.webpharmacy);
        String video = "<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/23M4ZBMab60?si=_QWv_20gMPlUiDfH\" title=\"YouTube video player\" frameborder=\"0\" allow=\"accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture; web-share\" allowfullscreen></iframe>";
        compweb.loadData(video,"text/html","uef-8");
        compweb.getSettings().setJavaScriptEnabled(true);
        compweb.setWebChromeClient(new WebChromeClient());


        Button comp = findViewById(R.id.clickpharmacy);

        comp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://www.careers360.com/courses/pharmacy-courses-after-12th-counar");
            }
        });



    }

    private void gotoUrl(String s) {
        Uri uri = Uri.parse(s);
        startActivity(new Intent(Intent.ACTION_VIEW,uri));
    }

}
