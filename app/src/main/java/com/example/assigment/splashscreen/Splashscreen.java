package com.example.assigment.splashscreen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.WindowManager;

import com.example.assigment.R;
import com.example.assigment.databinding.ActivitySplashscreenBinding;

public class Splashscreen extends AppCompatActivity {
private ActivitySplashscreenBinding sbinding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        sbinding=ActivitySplashscreenBinding.inflate(getLayoutInflater());
        setContentView(sbinding.getRoot());
        getSupportActionBar().hide();
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        new Handler().postDelayed(() -> {
            Intent i = new Intent(Splashscreen.this, aftersplashscreen.class);
            startActivity(i);
            finish();
        },2000);
    }
}