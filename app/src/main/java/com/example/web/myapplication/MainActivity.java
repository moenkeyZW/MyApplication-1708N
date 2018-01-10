package com.example.web.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main); // 设置当前窗体的视图
        WebView webView = new WebView(this); // 实例化一个 Webview
        WebSettings webSettings = webView.getSettings(); // 实例化一个 WebSettings
        webSettings.setJavaScriptEnabled(true); // 启用 JS
        webView.loadUrl("http://cn.bing.com"); // 加载网页

        setContentView(webView); // 更改视图为当前的 webview
    }
}
