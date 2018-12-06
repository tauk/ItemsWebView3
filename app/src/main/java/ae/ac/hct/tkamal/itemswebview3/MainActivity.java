package ae.ac.hct.tkamal.itemswebview3;

import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MainActivity extends Activity {

    private WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        webView = findViewById(R.id.webView);

        WebSettings webSettings = webView.getSettings();

        webSettings.setJavaScriptEnabled(true);
        webSettings.setDomStorageEnabled(true);
        webSettings.setDisplayZoomControls(true);

        webView.setInitialScale(0);

        webView.setWebViewClient(new ItemsWebViewClient());

        String url = "http://items-api3.eu-4.evennode.com/static/index.html";
        webView.loadUrl(url);

    }

    private class ItemsWebViewClient extends WebViewClient {
        @Override
        public boolean shouldOverrideUrlLoading(WebView webView, String url){
            return false;
        }
    }
}
