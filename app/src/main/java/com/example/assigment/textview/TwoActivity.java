package com.example.assigment.textview;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.assigment.R;
import com.example.assigment.databinding.ActivityTwoBinding;

public class TwoActivity extends AppCompatActivity {
private ActivityTwoBinding Twobinding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Twobinding = ActivityTwoBinding.inflate(getLayoutInflater());
        setContentView(Twobinding.getRoot());
        Intent i =getIntent();
        Emp eee = (Emp) i.getSerializableExtra("Object");

        Twobinding.TVid.setText(eee.id);
        Twobinding.TVname.setText(eee.Name);
        Twobinding.TVField.setText(eee.Field);
        Twobinding.TVselery.setText(eee.selery);
        Twobinding.TVaddress.setText(eee.Address);

    }
}