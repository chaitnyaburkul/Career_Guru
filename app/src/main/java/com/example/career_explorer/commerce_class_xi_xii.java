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

public class commerce_class_xi_xii extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_commerce_class_xi_xii);

        ImageView backmechaa = findViewById(R.id.backcommerce);

        backmechaa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(commerce_class_xi_xii.this, Class_XI_XII.class);
                startActivity(intent);
            }
        });

        WebView comweb = findViewById(R.id.webcom);
        String video = "<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/xmnZMRKq_wk?si=dd6uSxidWdOShFxU\" title=\"YouTube video player\" frameborder=\"0\" allow=\"accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture; web-share\" allowfullscreen></iframe>";
        comweb.loadData(video,"text/html","uef-8");
        comweb.getSettings().setJavaScriptEnabled(true);
        comweb.setWebChromeClient(new WebChromeClient());



        Button commm = findViewById(R.id.clickcom);

        commm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://www.careers360.com/courses/articles/commerce-courses-after-10th-counar");
            }
        });



    }

    private void gotoUrl(String s) {
        Uri uri = Uri.parse(s);
        startActivity(new Intent(Intent.ACTION_VIEW,uri));
    }
}
