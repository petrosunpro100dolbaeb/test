package com.example.smarthouse1;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class NewresidentActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_resident);
    }
    public void onclick_newresident(View view){
        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                startActivity(new Intent(NewresidentActivity.this, EnterYourHousActivity.class));
                finish();
            }
        },0);
    }
    public void onclick_enteryourhouse(View view){
        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                startActivity(new Intent(NewresidentActivity.this, EnterYourHousActivity.class));
                finish();
            }
        },0);
    }
}
