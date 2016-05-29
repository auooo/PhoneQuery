package com.auooo.phonequery;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText etPhone;
    private WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        etPhone = (EditText) findViewById(R.id.et_phone);
        webView = (WebView) findViewById(R.id.wv);
    }

    public void query(View view) {
        String phone = etPhone.getText().toString();
        String url = "http://nj.rent.house365.com/person_publish.php?mobile=" + phone;
        webView.getSettings().setJavaScriptEnabled(true);
        webView.setWebViewClient(new WebViewClient());
        webView.loadUrl(url);
        webView.getSettings().setLoadWithOverviewMode(true);
        webView.getSettings().setUseWideViewPort(true);
    }
}
