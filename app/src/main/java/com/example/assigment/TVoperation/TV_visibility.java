package com.example.assigment.TVoperation;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import com.example.assigment.databinding.ActivityTvVisibilityBinding;

public class TV_visibility extends AppCompatActivity {
private ActivityTvVisibilityBinding Vbinding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Vbinding = ActivityTvVisibilityBinding.inflate(getLayoutInflater());
        setContentView(Vbinding.getRoot());
        Vbinding.button.setOnClickListener(view -> {
            if(Vbinding.textView3.getVisibility()== View.VISIBLE){
                Vbinding.textView3.setVisibility(View.INVISIBLE);
            }
            if(Vbinding.textView3.getVisibility()== View.INVISIBLE){
                Vbinding.textView3.setVisibility(View.VISIBLE);
            }

        });
    }
}