package com.example.assigment.textview;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.example.assigment.R;
import com.example.assigment.databinding.ActivityOneBinding;

public class OneActivity extends AppCompatActivity {
private ActivityOneBinding Onebinding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Onebinding = ActivityOneBinding.inflate(getLayoutInflater());
        setContentView(Onebinding.getRoot());


        Onebinding.btnSend.setOnClickListener(view -> {
            Emp ee =new Emp(1,"Bhagvat","Android",20000,"Gandhinagar");

            Intent i = new Intent(this,TwoActivity.class);
            i.putExtra("Object",ee);
            startActivity(i);
        });
    }


}