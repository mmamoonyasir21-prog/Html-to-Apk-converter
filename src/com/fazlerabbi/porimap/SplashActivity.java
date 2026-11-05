package com.icon.app;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.webkit.WebView;

public class SplashActivity extends Activity {

    /** Holds a warmed-up WebView so Chromium initializes instantly. */
    private static WebView warmup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Warm up the WebView engine in the background
        if (warmup == null) {
            try {
                warmup = new WebView(getApplicationContext());
            } catch (Exception ignored) { }
        }

        // Jump straight to MainActivity without any delay or layout
        startActivity(new Intent(SplashActivity.this, MainActivity.class));
        finish();
    }
}
