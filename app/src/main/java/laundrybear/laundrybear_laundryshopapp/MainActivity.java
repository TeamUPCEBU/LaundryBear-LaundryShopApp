package laundrybear.laundrybear_laundryshopapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        WebView webview = new WebView(this);
        setContentView(webview);
        webview.setWebViewClient(new WebViewClient());
        webview.loadUrl("http://10.48.32.48:8000/login?next=/");

    }
}
