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

public class MonitoringSocial_Influencer extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_monitoring_social_influencer);

        ImageView backmechaa = findViewById(R.id.backmonitoring);

        backmechaa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MonitoringSocial_Influencer.this, SocialMedia_Influencer.class);
                startActivity(intent);
            }
        });

        WebView compweb = findViewById(R.id.webmonitoring);
        String video = "<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/wTvnk4JMweA?si=c4aeLmviqO221mPC\" title=\"YouTube video player\" frameborder=\"0\" allow=\"accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture; web-share\" allowfullscreen></iframe>";
        compweb.loadData(video,"text/html","uef-8");
        compweb.getSettings().setJavaScriptEnabled(true);
        compweb.setWebChromeClient(new WebChromeClient());


        Button comp = findViewById(R.id.clickmonitoring);

        comp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://brandmentions.com/hub/social-media-monitoring?utm_source=bing&utm_medium=cpc&utm_campaign=566680607&utm_id=566680607&utm_target_id=kwd-73255288048678:loc-90&msclkid=c05844e8b9a711295d9e212f9cb92ec6");
            }
        });



    }

    private void gotoUrl(String s) {
        Uri uri = Uri.parse(s);
        startActivity(new Intent(Intent.ACTION_VIEW,uri));
    }

}
