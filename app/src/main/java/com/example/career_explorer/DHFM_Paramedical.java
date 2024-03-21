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

public class DHFM_Paramedical extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dhfm_paramedical);

        ImageView backac = findViewById(R.id.backdhfm);

        backac.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(DHFM_Paramedical.this, Paramedical.class);
                startActivity(intent);
            }
        });

        WebView acweb = findViewById(R.id.webdhfm);
        String video = "<iframe width=\"560\" height=\"315\" src=\"https://www.youtube.com/embed/MeuCCJvJC8c?si=xS7Z6pUki-oXQR2g\" title=\"YouTube video player\" frameborder=\"0\" allow=\"accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture; web-share\" allowfullscreen></iframe>";
        acweb.loadData(video,"text/html","uef-8");
        acweb.getSettings().setJavaScriptEnabled(true);
        acweb.setWebChromeClient(new WebChromeClient());



        Button comp = findViewById(R.id.clickdhfm);

        comp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://www.careers360.com/courses/diploma-in-family-medicine");
            }
        });



    }

    private void gotoUrl(String s) {
        Uri uri = Uri.parse(s);
        startActivity(new Intent(Intent.ACTION_VIEW,uri));
    }
}

