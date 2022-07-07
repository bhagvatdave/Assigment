package com.example.assigment.recycleview;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

import com.example.assigment.databinding.ActivityEmpListBinding;

import java.util.ArrayList;

public class EmpListActivity extends AppCompatActivity {

    private ActivityEmpListBinding elbinding;
    private ArrayList<Emp> list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        elbinding = ActivityEmpListBinding.inflate(getLayoutInflater());
        setContentView(elbinding.getRoot());


        list = new ArrayList<>();


        elbinding.btnAdd.setOnClickListener(view -> {

            String name= elbinding.edtName.getText().toString();
            String field= elbinding.edtField.getText().toString();
            String address= elbinding.edtAddress.getText().toString();
            String salary= elbinding.edtSalary.getText().toString();

            Emp e = new Emp(name,field,Integer.parseInt(salary),address);
            if(!name.isEmpty() && !list.contains(e)){
                list.add(e);
                Intent i = new Intent(EmpListActivity.this,EmpShowActivity.class);
                Bundle b = new Bundle();
                b.putSerializable("list",list);
                i.putExtra("bundle",b);
                i.putExtra("Object1",e);
                startActivity(i);

            }

        });

    }
}