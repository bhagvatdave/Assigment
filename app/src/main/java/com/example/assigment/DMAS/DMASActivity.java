package com.example.assigment.DMAS;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.RadioButton;
import android.widget.TextView;

import com.example.assigment.R;
import com.example.assigment.databinding.ActivityDmasactivityBinding;

public class DMASActivity extends AppCompatActivity implements CompoundButton.OnCheckedChangeListener,TextWatcher {
private ActivityDmasactivityBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityDmasactivityBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        binding.Add1.setOnCheckedChangeListener(this);
        binding.Subtraction1.setOnCheckedChangeListener(this);
        binding.Multiply1.setOnCheckedChangeListener(this);
        binding.Division1.setOnCheckedChangeListener(this);
        binding.textinput1.addTextChangedListener(this);
        binding.textinput2.addTextChangedListener(this);
    }

    @Override
    public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
if (!binding.textinput1.getText().toString().equals("") || !binding.textinput2.getText().toString().equals("")){
    if (compoundButton.getText().equals("Division") && !binding.textinput2.getText().toString().equals("")){
        operations(compoundButton.getText().toString(),binding.textinput1.getText().toString(),binding.textinput2.getText().toString());
    }else{
        compoundButton.setChecked(false);
        binding.textinput1.setText("");
        binding.textinput2.setText("");
    }
}
    }

    @Override
    public void onPointerCaptureChanged(boolean hasCapture) {
        super.onPointerCaptureChanged(hasCapture);
    }

    @Override
    public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

    }

    @Override
    public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
        RadioButton RBtn = findViewById(binding.RBgroup.getCheckedRadioButtonId());
        if (!binding.textinput1.getText().toString().equals("") || !binding.textinput2.getText().toString().equals("")){
            if (RBtn.getText().equals("Division") && !binding.textinput2.getText().toString().equals("")){
                operations(RBtn.getText().toString(),binding.textinput1.getText().toString(),binding.textinput2.getText().toString());
            }else{
                RBtn.setChecked(false);
                binding.textinput1.setText("");
                binding.textinput2.setText("");
            }
        }
    }

    @Override
    public void afterTextChanged(Editable editable) {

    }
    public void operations(String Rbname,String Firstno,String Secondno){
        int int1 =Integer.parseInt(Firstno);
        int int2 =Integer.parseInt(Secondno);
        switch (Rbname){
            case "Add": binding.TVanswer.setText("The Sum 0f " + int1 + " and " + int2 + "is " + String.valueOf(int1 + int2));
                break;
            case "Subtraction":binding.TVanswer.setText("The Subtraction 0f " + int1 + " and " + int2 + "is " + String.valueOf(int1 - int2));
                break;
            case "Multiply":binding.TVanswer.setText("The Multiply 0f " + int1 + " and " + int2 + "is " + String.valueOf(int1 * int2));
                break;
            case "Division":binding.TVanswer.setText("The SDivision 0f " + int1 + " and " + int2 + "is " + String.valueOf(int1 / int2));
                break;
            default:
                break;
        }

    }
}