package com.example.assigment.splashscreen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import com.example.assigment.R;
import com.example.assigment.databinding.ActivitySplashscreenBinding;

public class Splashscreen extends AppCompatActivity {
private ActivitySplashscreenBinding sbinding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        sbinding=ActivitySplashscreenBinding.inflate(getLayoutInflater());
        setContentView(sbinding.getRoot());
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent i = new Intent(Splashscreen.this, aftersplashscreen.class);
            }
        },2000);
    }
}