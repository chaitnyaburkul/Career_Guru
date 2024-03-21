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

public class Agriculture_Vocational extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_agriculture_vocational);

        ImageView backagricul = findViewById(R.id.backagri);

        backagricul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Agriculture_Vocational.this, Vocational.class);
                startActivity(intent);
            }
        });

        WebView agriweb = findViewById(R.id.webagri);
        String video = "<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/mO8PzKi2qAY?si=wJvgRYFe-QF_ABmd\" title=\"YouTube video player\" frameborder=\"0\" allow=\"accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture; web-share\" allowfullscreen></iframe>";
        agriweb.loadData(video,"text/html","uef-8");
        agriweb.getSettings().setJavaScriptEnabled(true);
        agriweb.setWebChromeClient(new WebChromeClient());



        Button agriiii = findViewById(R.id.clickagri);

        agriiii.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://universitykart.com/course/coursedetails/bachelor-in-vocational-agriculture");
            }
        });



    }

    private void gotoUrl(String s) {
        Uri uri = Uri.parse(s);
        startActivity(new Intent(Intent.ACTION_VIEW,uri));
    }
}
