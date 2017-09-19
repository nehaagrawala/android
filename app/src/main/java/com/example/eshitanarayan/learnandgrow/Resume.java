package com.example.eshitanarayan.learnandgrow;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.CardView;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ImageView;

public class Resume extends AppCompatActivity {

    ImageView resume,coverletter;
    WebView webView;
    CardView res,cov;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resume);
        webView = (WebView)findViewById(R.id.webviewResumecover);

        res = (CardView)findViewById(R.id.resumecardview);
        res.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                webView.getSettings().setJavaScriptEnabled(true);
                webView.getSettings().setLoadsImagesAutomatically(true);
                webView.loadUrl("http://www.resumeworld.ca/resume-templates.html");
                webView.setWebViewClient(new WebViewClient());
            }
        });

        cov = (CardView)findViewById(R.id.covercardview);
        cov.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                webView.getSettings().setJavaScriptEnabled(true);
                webView.getSettings().setLoadsImagesAutomatically(true);
                webView.loadUrl("https://www.template.net/business/letters/cover-letter-template/");
                webView.setWebViewClient(new WebViewClient());
            }
        });

    }

}
