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

public class Civil_Diploma extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_civil_diploma);

        ImageView backmechaa = findViewById(R.id.backscivil);

        backmechaa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Civil_Diploma.this, Diploma.class);
                startActivity(intent);
            }
        });

        WebView athleweb = findViewById(R.id.webcivil);
        String video = "<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/NpxapL6Q368?si=9MhbQaes9POB2zot\" title=\"YouTube video player\" frameborder=\"0\" allow=\"accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture; web-share\" allowfullscreen></iframe>";
        athleweb.loadData(video,"text/html","uef-8");
        athleweb.getSettings().setJavaScriptEnabled(true);
        athleweb.setWebChromeClient(new WebChromeClient());



        Button athle = findViewById(R.id.clickcivil);

        athle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://collegedunia.com/courses/diploma-in-civil-engineering");
            }
        });



    }

    private void gotoUrl(String s) {
        Uri uri = Uri.parse(s);
        startActivity(new Intent(Intent.ACTION_VIEW,uri));
    }
}
