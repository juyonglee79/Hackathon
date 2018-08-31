package com.dsm2018.project;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ImageView;

import java.util.HashMap;
import java.util.Map;


public class ManualActivity extends AppCompatActivity {

    private WebView mWebView;
    private WebSettings mWebSettings;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_manual);

        mWebView = findViewById(R.id.webview);
        mWebView.setWebViewClient(new WebViewClient());
        mWebSettings = mWebView.getSettings();
        mWebSettings.setJavaScriptEnabled(true);

        Map<String, String> extraHeaders = new HashMap<String, String>();
//        extraHeaders.put("PHPSESSID", "47afd6da2780e8a3dff8d4898844555d");
        mWebView.loadUrl("http://xn--3e0bk66bigar3g55yfew9be2a.kr/bbs/board.php?bo_table=board1103&wr_id=2");
    }
}

