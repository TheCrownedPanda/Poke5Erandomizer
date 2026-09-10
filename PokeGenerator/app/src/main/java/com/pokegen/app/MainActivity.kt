package com.pokegen.app

import android.annotation.SuppressLint
import android.graphics.Color
import android.os.Bundle
import android.view.View
import android.webkit.WebView
import android.webkit.WebViewClient
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    @SuppressLint("SetJavaScriptEnabled")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val webView = WebView(this)
        setContentView(webView)

        webView.setBackgroundColor(Color.parseColor("#0D0E1C"))
        webView.settings.javaScriptEnabled = true
        webView.settings.domStorageEnabled = true
        webView.webViewClient = WebViewClient()

        // Edge-to-edge dark UI, matches in-app theme
        window.decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_LAYOUT_STABLE
        window.statusBarColor = Color.parseColor("#0D0E1C")
        window.navigationBarColor = Color.parseColor("#0D0E1C")

        webView.loadUrl("file:///android_asset/index.html")
    }

    override fun onBackPressed() {
        // No in-app navigation history to walk back through; just exit normally.
        super.onBackPressed()
    }
}
