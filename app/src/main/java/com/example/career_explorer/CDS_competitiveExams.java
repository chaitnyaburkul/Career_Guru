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

public class CDS_competitiveExams extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cds_competitive_exams);

        ImageView backcdsss = findViewById(R.id.backcds);

        backcdsss.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CDS_competitiveExams.this, Compatitive_exams.class);
                startActivity(intent);
            }
        });

        WebView cdsweb = findViewById(R.id.webcds);
        String video = "<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/kCJvIrkOaTU?si=RHGF3YQWanbw3I0R\" title=\"YouTube video player\" frameborder=\"0\" allow=\"accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture; web-share\" allowfullscreen></iframe>";
        cdsweb.loadData(video,"text/html","uef-8");
        cdsweb.getSettings().setJavaScriptEnabled(true);
        cdsweb.setWebChromeClient(new WebChromeClient());



        Button cdss = findViewById(R.id.clickcds);

        cdss.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://en.wikipedia.org/wiki/Combined_Defence_Services_Examination");
            }
        });



    }

    private void gotoUrl(String s) {
        Uri uri = Uri.parse(s);
        startActivity(new Intent(Intent.ACTION_VIEW,uri));
    }
}


