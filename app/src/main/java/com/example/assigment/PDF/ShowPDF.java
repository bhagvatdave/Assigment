package com.example.assigment.PDF;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

import com.example.assigment.databinding.ActivityShowPdfBinding;

public class ShowPDF extends AppCompatActivity {
private ActivityShowPdfBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityShowPdfBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
binding.pdf.setOnClickListener(view -> {
    viewpdf();
});
    }
    private void viewpdf() {
        // add the link of pdf
        String value="https://www.w3.org/WAI/ER/tests/xhtml/testfiles/resources/pdf/dummy.pdf";
        Intent intent=new Intent(Intent.ACTION_VIEW, Uri.parse(value));
        // start activity
        startActivity(intent);
    }
}