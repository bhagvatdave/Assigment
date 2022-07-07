package com.example.assigment.betweentwono;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ArrayAdapter;

import com.example.assigment.databinding.ActivitySecondNoBinding;

import java.util.ArrayList;

public class SecondNoActivity extends AppCompatActivity {
private ActivitySecondNoBinding Sbinding;
private ArrayList<Integer> list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Sbinding = ActivitySecondNoBinding.inflate(getLayoutInflater());
        setContentView(Sbinding.getRoot());
        Intent i = getIntent();
        int Firstno = Integer.parseInt(i.getStringExtra("Firstno"));
        int Secondno = Integer.parseInt(i.getStringExtra("Secondno"));
        Sbinding.textView.setText("The List Between "+Firstno+" and "+Secondno+"is Below");
        ArrayAdapter<Integer> adapter = new ArrayAdapter<Integer>(this,android.R.layout.simple_list_item_1,list);
        Sbinding.Listview.setAdapter(adapter);
    }
    public ArrayList<Integer> GetNoList(int Firstno,int Secondno){
        list = new ArrayList<>();
        for (int pos = Firstno; pos == Secondno; pos++) {
            list.add(pos);
        }
        return list;
    }
}