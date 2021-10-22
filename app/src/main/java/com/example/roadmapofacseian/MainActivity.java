package com.example.roadmapofacseian;

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
    public static int SPLASH_TIME_OUT = 5000;
    Animation top_anim, bottam_anim;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_main);
        top_anim = AnimationUtils.loadAnimation(this, R.anim.top_animation);
        bottam_anim = AnimationUtils.loadAnimation(this, R.anim.bottam_animation);
        textView = findViewById(R.id.textview001);
        top_anim.setDuration(2000);
        textView.setAnimation(bottam_anim);
        bottam_anim.setDuration(2000);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(MainActivity.this, MainActivity2.class);
                startActivity(intent);
                finish();
            }
        }, SPLASH_TIME_OUT);
    }
}
