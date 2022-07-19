package com.example.assigment.webview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.util.Log;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Toast;

import com.example.assigment.R;
import com.example.assigment.databinding.ActivityWebviewBinding;

public class Webview extends AppCompatActivity {
private ActivityWebviewBinding Wbinding;
    ConnectivityManager connectivityManager;
    NetworkInfo wifiInfo, mobileInfo;
    boolean connected = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Wbinding = ActivityWebviewBinding.inflate(getLayoutInflater());
        setContentView(Wbinding.getRoot());
        Wbinding.webview.getSettings().setJavaScriptEnabled(true);
        Wbinding.backButton.setOnClickListener(view -> {
            if(Wbinding.webview.canGoBack()){
                Wbinding.webview.goBack();
            }
        });
        Wbinding.forwardButton.setOnClickListener(view -> {
            if(Wbinding.webview.canGoForward()){
                Wbinding.webview.goForward();
            }
        });
        Wbinding.webview.setWebViewClient(new WebViewClient(){
            @Override
            public void onPageStarted(WebView view, String url, Bitmap favicon) {
                super.onPageStarted(view, url, favicon);
            }

            @Override
            public void onPageFinished(WebView view, String url) {
                super.onPageFinished(view, url);
                Wbinding.backButton.setEnabled(view.canGoBack());
                Wbinding.forwardButton.setEnabled(view.canGoForward());
            }


            @Override
            public void onReceivedError( WebView view, int errorCode, String description, String failingUrl ) {

                super.onReceivedError(Wbinding.webview, errorCode, description, failingUrl );
                Toast toast = Toast.makeText(getApplicationContext(), description, Toast.LENGTH_LONG);
            }
        });
        if (isOnline()) {

            Wbinding.webview.loadUrl("www.google.com");

        } else {

            Toast.makeText(this,"You are not online!!!!", Toast.LENGTH_SHORT).show();
            Log.v("Home", "############################You are not online!!!!");
        }
    }
    public boolean isOnline() {
        try {
            connectivityManager = (ConnectivityManager) getApplicationContext()
                    .getSystemService(Context.CONNECTIVITY_SERVICE);

            NetworkInfo networkInfo = connectivityManager.getActiveNetworkInfo();
            connected = networkInfo != null && networkInfo.isAvailable() &&
                    networkInfo.isConnected();
            return connected;
        } catch (Exception e) {
            System.out.println("CheckConnectivity Exception: " + e.getMessage());
            Log.v("connectivity", e.toString());
        }
        return connected;
    }
}