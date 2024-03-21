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

public class arts_class_xi_xii extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_arts_class_xi_xii);

        ImageView backartsss = findViewById(R.id.backarts);

        backartsss.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(arts_class_xi_xii.this, Class_XI_XII.class);
                startActivity(intent);
            }
        });


        WebView artsweb = findViewById(R.id.webarts);
        String video = "<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/HhE97ngfo8U?si=og9xZkBoNLC0CA8n\" title=\"YouTube video player\" frameborder=\"0\" allow=\"accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture; web-share\" allowfullscreen></iframe>";
        artsweb.loadData(video,"text/html","uef-8");
        artsweb.getSettings().setJavaScriptEnabled(true);
        artsweb.setWebChromeClient(new WebChromeClient());



        Button artss = findViewById(R.id.clickarts);

        artss.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://www.careers360.com/courses/articles/arts-courses-after-10th-counar");
            }
        });



    }

    private void gotoUrl(String s) {
        Uri uri = Uri.parse(s);
        startActivity(new Intent(Intent.ACTION_VIEW,uri));
    }
}

