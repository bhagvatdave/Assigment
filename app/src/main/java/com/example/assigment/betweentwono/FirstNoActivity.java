package com.example.assigment.betweentwono;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

import com.example.assigment.databinding.ActivityFirstNoBinding;

public class FirstNoActivity extends AppCompatActivity {
private ActivityFirstNoBinding Fbinding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Fbinding = ActivityFirstNoBinding.inflate(getLayoutInflater());
        setContentView(Fbinding.getRoot());
Fbinding.btnsend.setOnClickListener(view -> {
    if(Integer.parseInt(Fbinding.textinput1.getText().toString())<Integer.parseInt(Fbinding.textinput1.getText().toString())){
        Intent i = new Intent(this,SecondNoActivity.class);
        i.putExtra("Firstno",Fbinding.textinput1.getText().toString());
        i.putExtra("Secondno",Fbinding.textinput2.getText().toString());
        startActivity(i);
    }else{
        Toast.makeText(this, "The Second value Should be Greater then First value", Toast.LENGTH_SHORT).show();
        Fbinding.textinput1.setText("");
        Fbinding.textinput1.setText("");
        Fbinding.textinput1.setFocusable(true);
    }
});
    }
}