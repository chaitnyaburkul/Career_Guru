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

public class CommunityManager_Esports extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_community_manager_esports);

        ImageView backmechaa = findViewById(R.id.backcm);

        backmechaa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CommunityManager_Esports.this, ESports.class);
                startActivity(intent);
            }
        });

        WebView commuweb = findViewById(R.id.webcommu);
        String video = "<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/NmdKaNAX0uo?si=lBNtZ15KeYT9TKJv\" title=\"YouTube video player\" frameborder=\"0\" allow=\"accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture; web-share\" allowfullscreen></iframe>";
        commuweb.loadData(video,"text/html","uef-8");
        commuweb.getSettings().setJavaScriptEnabled(true);
        commuweb.setWebChromeClient(new WebChromeClient());



        Button commu = findViewById(R.id.clickcommu);

        commu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://www.coursera.org/courses?query=community%20manager");
            }
        });



    }

    private void gotoUrl(String s) {
        Uri uri = Uri.parse(s);
        startActivity(new Intent(Intent.ACTION_VIEW,uri));
    }
}
