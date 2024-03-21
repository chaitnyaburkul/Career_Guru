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

public class mcvc_class_xi_xii extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mcvc_class_xi_xii);

        ImageView backmechaa = findViewById(R.id.backmcvc);

        backmechaa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(mcvc_class_xi_xii.this, Class_XI_XII.class);
                startActivity(intent);
            }
        });

        WebView compweb = findViewById(R.id.webmcvc);
        String video = "<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/z4y3aQjjEUM?si=7WuKiTazIg_V7gZ2\" title=\"YouTube video player\" frameborder=\"0\" allow=\"accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture; web-share\" allowfullscreen></iframe>";
        compweb.loadData(video,"text/html","uef-8");
        compweb.getSettings().setJavaScriptEnabled(true);
        compweb.setWebChromeClient(new WebChromeClient());


        Button comp = findViewById(R.id.clickmcvc);

        comp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://kjssc.somaiya.edu.in/en/programme/HSC-minimum-competency-and-vocational-courses");
            }
        });



    }

    private void gotoUrl(String s) {
        Uri uri = Uri.parse(s);
        startActivity(new Intent(Intent.ACTION_VIEW,uri));
    }

}
