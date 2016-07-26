package com.example.dell_09_027_pc.proyectomuseos;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class WebActivity extends AppCompatActivity
{

    private WebView mWebView;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web);

        mWebView =  (WebView) findViewById (R.id.webView);

        mWebView.loadUrl ("http://elcomercio.es/");
    }
}
