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

public class Animation_shortTerm extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_animation_short_term);

        ImageView backani = findViewById(R.id.backanimation);

        backani.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Animation_shortTerm.this, ShortTerm_Courses.class);
                startActivity(intent);
            }
        });

        WebView aniweb = findViewById(R.id.webani);
        String video = "<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/vuLveHMHkkE?si=zksY8waN2gYHF-40\" title=\"YouTube video player\" frameborder=\"0\" allow=\"accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture; web-share\" allowfullscreen></iframe>";
        aniweb.loadData(video,"text/html","uef-8");
        aniweb.getSettings().setJavaScriptEnabled(true);
        aniweb.setWebChromeClient(new WebChromeClient());



        Button aniii = findViewById(R.id.clickani);

        aniii.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://www.collegedekho.com/articles/best-animation-courses-after-class-10/");
            }
        });



    }

    private void gotoUrl(String s) {
        Uri uri = Uri.parse(s);
        startActivity(new Intent(Intent.ACTION_VIEW,uri));
    }
}

