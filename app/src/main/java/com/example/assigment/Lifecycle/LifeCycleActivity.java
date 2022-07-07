package com.example.assigment.Lifecycle;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

import com.example.assigment.databinding.ActivityLifeCycleBinding;

public class LifeCycleActivity extends AppCompatActivity {
private ActivityLifeCycleBinding LCbinding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        LCbinding = ActivityLifeCycleBinding.inflate(getLayoutInflater());
        setContentView(LCbinding.getRoot());

        Toast.makeText(this, "onCreate Called", Toast.LENGTH_LONG).show();
    }
    protected void onStart() {
        super.onStart();
        Toast.makeText(this, "onStart Called", Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Toast.makeText(this, "onRestart Called", Toast.LENGTH_LONG).show();
    }

    protected void onPause() {
        super.onPause();
        Toast.makeText(this, "onPause Called", Toast.LENGTH_LONG).show();
    }

    protected void onResume() {
        super.onResume();
        Toast.makeText(this, "onResume Called", Toast.LENGTH_LONG).show();
    }

    protected void onStop() {
        super.onStop();
        Toast.makeText(this, "onStop Called", Toast.LENGTH_LONG).show();
    }

    protected void onDestroy() {
        super.onDestroy();
        Toast.makeText(this, "onDestroy Called", Toast.LENGTH_LONG).show();
    }
}