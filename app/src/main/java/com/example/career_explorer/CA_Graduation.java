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

public class CA_Graduation extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ca_graduation);

        ImageView backcaa = findViewById(R.id.backca);

        backcaa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CA_Graduation.this, Graduation.class);
                startActivity(intent);
            }
        });


        WebView athleweb = findViewById(R.id.webca);
        String video = "<iframe width=\"560\" height=\"315\" src=\"https://www.youtube.com/embed/NderkpSABzw?si=GbbQnqYfnBlF0BQm\" title=\"YouTube video player\" frameborder=\"0\" allow=\"accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture; web-share\" allowfullscreen></iframe>";
        athleweb.loadData(video,"text/html","uef-8");
        athleweb.getSettings().setJavaScriptEnabled(true);
        athleweb.setWebChromeClient(new WebChromeClient());



        Button athle = findViewById(R.id.clickca);

        athle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://www.getmyuni.com/chartered-accountancy-ca-course");
            }
        });



    }

    private void gotoUrl(String s) {
        Uri uri = Uri.parse(s);
        startActivity(new Intent(Intent.ACTION_VIEW,uri));
    }
}


