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

public class WebDesign_shortTerm extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web_design_short_term);

        ImageView backmechaa = findViewById(R.id.backweb);

        backmechaa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(WebDesign_shortTerm.this, ShortTerm_Courses.class);
                startActivity(intent);
            }
        });

        WebView compweb = findViewById(R.id.webweb);
        String video = "<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/Jn1fiPBZnU4?si=Xs_7P2fhZh9ymNm0\" title=\"YouTube video player\" frameborder=\"0\" allow=\"accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture; web-share\" allowfullscreen></iframe>";
        compweb.loadData(video,"text/html","uef-8");
        compweb.getSettings().setJavaScriptEnabled(true);
        compweb.setWebChromeClient(new WebChromeClient());


        Button comp = findViewById(R.id.clickweb);

        comp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://www.coursera.org/courses?query=web%20design&amp;page=64&amp;index=prod_all_launched_products_term_optimization&utm_source=bg&utm_medium=sem&utm_campaign=B2C_INDIA_google-data-analytics_google_FTCOF_professional-certificates_arte_bing&utm_content=B2C_INDIA_google-data-analytics_google_FTCOF_professional-certificates_arte-agency_bing&campaignid=415452288&adgroupid=1255643580470156&device=c&keyword=coursera&matchtype=b&network=o&devicemodel=&adpostion=&creativeid=&hide_mobile_promo&msclkid=81f0c1f0b10417b1202aa437fcecf1d0&utm_term=coursera");
            }
        });



    }

    private void gotoUrl(String s) {
        Uri uri = Uri.parse(s);
        startActivity(new Intent(Intent.ACTION_VIEW,uri));
    }

}

