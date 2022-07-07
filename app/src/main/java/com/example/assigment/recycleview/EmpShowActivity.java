package com.example.assigment.recycleview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

import android.content.Intent;
import android.os.Bundle;

import com.example.assigment.databinding.ActivityEmpShowBinding;

import java.util.ArrayList;

public class EmpShowActivity extends AppCompatActivity {
private ActivityEmpShowBinding ESBinding;
private ArrayList<Emp> list;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ESBinding = ActivityEmpShowBinding.inflate(getLayoutInflater());
        setContentView(ESBinding.getRoot());
        list = new ArrayList<>();
        Intent i = getIntent();
        Bundle b = i.getBundleExtra("bundle");
        ArrayList<Emp> newList = (ArrayList<Emp>) b.getSerializable("list");
        list=newList;
        ESBinding.recyclerViewEmp.setLayoutManager(new StaggeredGridLayoutManager(2, LinearLayoutManager.VERTICAL));
        EmpAdapter adapter = new EmpAdapter(list);
        ESBinding.recyclerViewEmp.setAdapter(adapter);
        adapter.notifyDataSetChanged();

    }
}