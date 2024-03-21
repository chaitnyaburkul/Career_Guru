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

public class Collaboration_Influencer extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_collaboration_influencer);

        ImageView backmechaa = findViewById(R.id.backupcollaboration);

        backmechaa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Collaboration_Influencer.this, SocialMedia_Influencer.class);
                startActivity(intent);
            }
        });

        WebView collaweb = findViewById(R.id.webcolla);
        String video = "<iframe width=\"100%\" height=\100%\" src=\"https://www.youtube.com/embed/HjYBcSqRepA?si=jQWnWoQfEPtgWxVR\" title=\"YouTube video player\" frameborder=\"0\" allow=\"accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture; web-share\" allowfullscreen></iframe>";
        collaweb.loadData(video,"text/html","uef-8");
        collaweb.getSettings().setJavaScriptEnabled(true);
        collaweb.setWebChromeClient(new WebChromeClient());



        Button collla = findViewById(R.id.clickcolla);

        collla.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://www.businesstrainingworks.com/onsite-courses/collaboration-skills-training-course/");
            }
        });



    }

    private void gotoUrl(String s) {
        Uri uri = Uri.parse(s);
        startActivity(new Intent(Intent.ACTION_VIEW,uri));
    }
}
