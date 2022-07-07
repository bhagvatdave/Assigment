package com.example.assigment.ByIntent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

import com.example.assigment.R;
import com.example.assigment.databinding.ActivityCallSmsMailShareBinding;

public class CallSMSMailShareActivity extends AppCompatActivity {
private ActivityCallSmsMailShareBinding CSMSBinding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        CSMSBinding = ActivityCallSmsMailShareBinding.inflate(getLayoutInflater());
        setContentView(CSMSBinding.getRoot());
        CSMSBinding.btnSendEmail.setOnClickListener(view -> {
            String to=CSMSBinding.Edittxtemailaddress.getText().toString();
            String message = CSMSBinding.EdittxtMsg.getText().toString();
            Intent email = new Intent(Intent.ACTION_SEND);
            email.putExtra(Intent.EXTRA_EMAIL, new String[]{ to});
            email.putExtra(Intent.EXTRA_TEXT, message);
            email.setType("message/rfc822");
            startActivity(Intent.createChooser(email, "Choose an Email client :"));
        });
        CSMSBinding.btnSendCall.setOnClickListener(view -> {
            String number = CSMSBinding.Edittxtphone.getText().toString();
            Intent Calling = new Intent(Intent.ACTION_DIAL);
            Calling.setData(Uri.parse("tel:" + number));
            startActivity(Calling);
        });
        CSMSBinding.btnSendSMS.setOnClickListener(view -> {
            String number = CSMSBinding.Edittxtphone.getText().toString();
            String message = CSMSBinding.EdittxtMsg.getText().toString();
            Uri uri = Uri.parse("smsto:" + number);
            Intent sendSMS = new Intent(Intent.ACTION_SENDTO, uri);
            sendSMS.putExtra("sms_body", message);
            startActivity(sendSMS);
        });
        CSMSBinding.btnShare.setOnClickListener(view -> {
            Intent intent = new Intent(android.content.Intent.ACTION_SEND);
            String shareBody = CSMSBinding.EdittxtMsg.getText().toString();
            intent.setType("text/plain");
            intent.putExtra(android.content.Intent.EXTRA_TEXT, shareBody);
            /*Fire!*/
            startActivity(Intent.createChooser(intent, "share_using"));
        });
    }

}