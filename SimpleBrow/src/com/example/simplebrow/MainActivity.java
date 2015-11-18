//Designed & Developed By Shubham Shah
package com.example.simplebrow;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.webkit.WebView;
import android.widget.Button;

public class MainActivity extends Activity {
	WebView wb;
	Button back,fwd;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        wb= (WebView) findViewById(R.id.wvBrowser);
        wb.setWebViewClient(new Client());
        wb.loadUrl("http://www.sabjimandi.byethost32.com/wp/");
        back=(Button) findViewById(R.id.back);
        fwd=(Button) findViewById(R.id.fwd);
        back.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				try
				{if(wb.canGoBack())
					wb.goBack();
				}catch(Exception e)
				{
					e.printStackTrace();
				}
			}
		});
        fwd.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				try
				{if(wb.canGoForward())
					wb.goForward();
				}catch(Exception e1)
				{
					e1.printStackTrace();
				}
			}
		});
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.activity_main, menu);
        return true;
    }
    
}
