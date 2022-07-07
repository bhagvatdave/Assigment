package com.example.assigment.sumnumber;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import com.example.assigment.databinding.ActivitySumDisplayBinding;

public class SumDisplayActivity extends AppCompatActivity {
private ActivitySumDisplayBinding Dbinding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Dbinding= ActivitySumDisplayBinding.inflate(getLayoutInflater());
        setContentView(Dbinding.getRoot());
               Intent i = getIntent();
               Double addSum = i.getDoubleExtra("AddSum",0.00);
               Dbinding.textView2.setText(Double.toString(addSum));
    }
}