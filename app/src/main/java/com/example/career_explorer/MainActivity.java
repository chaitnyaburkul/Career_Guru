package com.example.career_explorer;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private static int SPLASH_SCREEN=4500;

    ImageView i;

    TextView t1,t2;

    Animation top, bottom;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_main);
        i = findViewById(R.id.pic);
        t1= findViewById(R.id.textview1);
        t2= findViewById(R.id.textview2);


        top= AnimationUtils.loadAnimation(this,R.anim.top);
        i.startAnimation(top);
        t1.startAnimation(top);
        bottom= AnimationUtils.loadAnimation(this,R.anim.bottom);
        t2.startAnimation(bottom);


        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent i =new Intent(MainActivity.this, welcome.class);
                startActivity(i);

            }
        },SPLASH_SCREEN);

    }
}