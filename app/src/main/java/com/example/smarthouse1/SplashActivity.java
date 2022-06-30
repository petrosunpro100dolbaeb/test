package com.example.smarthouse1;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class SplashActivity extends AppCompatActivity {

    ImageView imagelogo;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        getSupportActionBar().hide();

        imagelogo = findViewById(R.id.imagelogo);

        final Animation animationRotateCenter = AnimationUtils.loadAnimation(this, R.anim.rotate_center);
        imagelogo.startAnimation(animationRotateCenter);

        Handler handler =new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                startActivity(new Intent(SplashActivity.this, EnterYourHousActivity.class));
                finish();
            }
        },2500);
    }
}
