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

public class ba_after12 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ba_after12);

        ImageView backmechaa = findViewById(R.id.backba);

        backmechaa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ba_after12.this, after_12.class);
                startActivity(intent);
            }
        });


        WebView baweb = findViewById(R.id.webba);
        String video = "<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/mZsNEtomrYk?si=4AixPV_ES6vfhe6j\" title=\"YouTube video player\" frameborder=\"0\" allow=\"accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture; web-share\" allowfullscreen></iframe>";
        baweb.loadData(video,"text/html","uef-8");
      baweb.getSettings().setJavaScriptEnabled(true);
        baweb.setWebChromeClient(new WebChromeClient());



        Button athle = findViewById(R.id.clickba);

        athle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://collegedunia.com/courses/bachelor-of-arts-ba");
            }
        });



    }

    private void gotoUrl(String s) {
        Uri uri = Uri.parse(s);
        startActivity(new Intent(Intent.ACTION_VIEW,uri));
    }
}




