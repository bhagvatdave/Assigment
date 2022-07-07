package com.example.assigment.Revercenumber;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;

import com.example.assigment.R;
import com.example.assigment.databinding.ActivityRevercenumberBinding;

public class Revercenumber extends AppCompatActivity {
private ActivityRevercenumberBinding Rbinding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Rbinding = ActivityRevercenumberBinding.inflate(getLayoutInflater());
        setContentView(Rbinding.getRoot());

        Rbinding.textinput.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                if (String.valueOf(charSequence).length() > 0) {
                    Rbinding.tvdisplay.setText(String.valueOf(reversDigits(Integer.parseInt(String.valueOf(charSequence)))));
                }
            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });
    }
    public int reversDigits(int num){
        // converting number to string
        StringBuffer string
                = new StringBuffer(String.valueOf(num));

        // reversing the string
        string.reverse();

        // converting string to integer
        num = Integer.parseInt(String.valueOf(string));

        // returning integer
        return num;
    }
}