package com.example.ouryearbook;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;

public class graduation2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_graduation2);

        Button graduation2Btn1 = (Button) findViewById(R.id.graduation2Btn1);
        WebView browser = (WebView) findViewById(R.id.careerview);
        browser.loadUrl("https://www.youtube.com/watch?v=cnNE83QYobk&ab_channel=CareerVidz");
        browser.getSettings().setJavaScriptEnabled(true);
        browser.setWebViewClient(new WebViewClient() {
            @Override
            public boolean shouldOverrideUrlLoading(WebView view, String url) {
                //url will be the url that you click in your webview.
                //you can open it with your own webview or do
                //whatever you want

                //Here is the example that you open it your own webview.
                view.loadUrl(url);
                return true;
            }
        });

        //this is how you get graduation2 to return back to the dashboard
        graduation2Btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(i);
            }
        });




    }
}