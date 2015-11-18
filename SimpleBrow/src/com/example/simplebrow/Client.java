//Designed & Developed By Shubham Shah
package com.example.simplebrow;

import android.webkit.WebView;
import android.webkit.WebViewClient;

public class Client extends WebViewClient {

	@Override
	public boolean shouldOverrideUrlLoading(WebView v , String url)
	{
		v.loadUrl(url);
		return true;
	}
}
