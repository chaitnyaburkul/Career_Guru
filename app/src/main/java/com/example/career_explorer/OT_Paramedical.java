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

public class OT_Paramedical extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ot_paramedical);

        ImageView backac = findViewById(R.id.backot);

        backac.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(OT_Paramedical.this, Paramedical.class);
                startActivity(intent);
            }
        });

        WebView acweb = findViewById(R.id.webot);
        String video = "<iframe width=\"560\" height=\"315\" src=\"https://www.youtube.com/embed/Wrz2yhddd8g?si=rKk1N2s-61pLTTzr\" title=\"YouTube video player\" frameborder=\"0\" allow=\"accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture; web-share\" allowfullscreen></iframe>";
        acweb.loadData(video,"text/html","uef-8");
        acweb.getSettings().setJavaScriptEnabled(true);
        acweb.setWebChromeClient(new WebChromeClient());



        Button comp = findViewById(R.id.clickot);

        comp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://collegedunia.com/courses/diploma-in-operation-theatre-technology");
            }
        });



    }

    private void gotoUrl(String s) {
        Uri uri = Uri.parse(s);
        startActivity(new Intent(Intent.ACTION_VIEW,uri));
    }
}


