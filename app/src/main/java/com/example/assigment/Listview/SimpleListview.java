package com.example.assigment.Listview;

import android.os.Bundle;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.assigment.databinding.ActivitySimpleListviewBinding;

public class SimpleListview extends AppCompatActivity {
private ActivitySimpleListviewBinding SLbinding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        SLbinding = ActivitySimpleListviewBinding.inflate(getLayoutInflater());
        setContentView(SLbinding.getRoot());
        SLbinding.listView.setOnItemClickListener((adapterView, view, pos, l) -> {
            Toast.makeText(this, SLbinding.listView.getItemAtPosition(pos).toString(), Toast.LENGTH_SHORT).show();
        });
    }
}