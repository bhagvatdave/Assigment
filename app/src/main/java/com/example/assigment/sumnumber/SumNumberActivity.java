package com.example.assigment.sumnumber;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import com.example.assigment.databinding.ActivitySumNumberBinding;

public class SumNumberActivity extends AppCompatActivity {
private ActivitySumNumberBinding Sbinding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Sbinding = ActivitySumNumberBinding.inflate(getLayoutInflater());
        setContentView(Sbinding.getRoot());
        Sbinding.addButton.setOnClickListener(view -> {
            double num1 = Double.parseDouble(Sbinding.editTextFirstNo.getText().toString());
            double num2 = Double.parseDouble(Sbinding.editTextSecondNo.getText().toString());

            double sum = num1 + num2;

            Intent i = new Intent(this,SumDisplayActivity.class);
            i.putExtra("AddSum",sum);
            startActivity(i);
        });
    }
}