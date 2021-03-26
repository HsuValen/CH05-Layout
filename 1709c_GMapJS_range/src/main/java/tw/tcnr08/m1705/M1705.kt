package tw.tcnr08.m1705

import androidx.appcompat.app.AppCompatActivity
import android.webkit.WebView
import android.os.Bundle
import android.annotation.SuppressLint
import android.view.View


class M1705 : AppCompatActivity() {
    private var webView: WebView? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.m1705)
        setupViewCompoent()
    }

    @SuppressLint("JavascriptInterface")
    private fun setupViewCompoent() {
        webView = findViewById<View>(R.id.webview) as WebView
        webView!!.settings.javaScriptEnabled = true
        webView!!.addJavascriptInterface(this@M1705, "AndroidFunction")
        webView!!.loadUrl(MAP_URL)
    }

    companion object {
        private const val MAP_URL = "file:///android_asset/GoogleMap.html" // 自建的html檔名
    }
}