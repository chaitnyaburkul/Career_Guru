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

public class NDA_competitiveExams extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nda_competitive_exams);

        ImageView backmechaa = findViewById(R.id.backnda);

        backmechaa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(NDA_competitiveExams.this, Compatitive_exams.class);
                startActivity(intent);
            }
        });

        WebView compweb = findViewById(R.id.webnda);
        String video = "<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/ealtyFK3YXE?si=bFfTKo3WZFXJpdOv\" title=\"YouTube video player\" frameborder=\"0\" allow=\"accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture; web-share\" allowfullscreen></iframe>";
        compweb.loadData(video,"text/html","uef-8");
        compweb.getSettings().setJavaScriptEnabled(true);
        compweb.setWebChromeClient(new WebChromeClient());


        Button comp = findViewById(R.id.clicknda);

        comp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://en.wikipedia.org/wiki/NDA_Exam#:~:text=The%20NDA%20Exam%20is%20an%20entrance%20examination%20conducted,in%20the%20Indian%20Army%2C%20Navy%2C%20and%20Air%20Force.");
            }
        });



    }

    private void gotoUrl(String s) {
        Uri uri = Uri.parse(s);
        startActivity(new Intent(Intent.ACTION_VIEW,uri));
    }

}
