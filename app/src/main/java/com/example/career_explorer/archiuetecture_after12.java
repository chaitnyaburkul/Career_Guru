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

public class archiuetecture_after12 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_archiuetecture_after12);

        ImageView backarchie = findViewById(R.id.backarchitecture);

        backarchie.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(archiuetecture_after12.this, after_12.class);
                startActivity(intent);
            }
        });

        WebView archiweb = findViewById(R.id.webarchi);
        String video = "<iframe width=\"100\" height=\"100\" src=\"https://www.youtube.com/embed/k606N7IIePU?si=_r-pSrqNbElmRB_f\" title=\"YouTube video player\" frameborder=\"0\" allow=\"accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture; web-share\" allowfullscreen></iframe>";
        archiweb.loadData(video,"text/html","uef-8");
        archiweb.getSettings().setJavaScriptEnabled(true);
        archiweb.setWebChromeClient(new WebChromeClient());



        Button aniii = findViewById(R.id.clickarchi);

        aniii.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://www.careers360.com/courses/articles/architecture-courses-after-12th-counar");
            }
        });



    }

    private void gotoUrl(String s) {
        Uri uri = Uri.parse(s);
        startActivity(new Intent(Intent.ACTION_VIEW,uri));
    }


    }
