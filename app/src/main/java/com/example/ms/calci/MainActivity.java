package com.example.ms.calci;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.webkit.JavascriptInterface;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


import org.mozilla.javascript.Evaluator;

import java.util.*;


/**
 * This app displays an order form to order coffee.
 */
public class MainActivity extends ActionBarActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        WebView myWebView = (WebView) findViewById(R.id.webView);
        WebSettings webSettings = myWebView.getSettings();
        webSettings.setJavaScriptEnabled(true);
        String summary = "<html><body><script>document.write(eval(0*0));</script></body></html>";
        myWebView.loadData(summary, "text/html", null);

    }


    int dona=0;
    String mess = "";
    public int chk() {
        int length = mess.length();

        String lastChar = mess.substring(length - 1);

        if (lastChar.contains("%")) {
            mess = mess.substring(0, length - 1) + "*";
            return (1);
        }
        return (0);
    }
    public void press7(View view) {
        int don=0;
        if(dona ==1 )
            don=chk();
        if(don==1)
            mess=mess+ 0.07;
        else
            mess = mess + "7";
        display(mess);
    }
    public void press8(View view) {
        int don=0;
        if(dona ==1 )
        don=chk();
        if(don==1)
            mess=mess+"0.08";
        else
            mess=mess+8;
        display(mess);
    }
    public void press9(View view) {
        int don=0;
        if(dona ==1 )
        don=chk();
        if(don==1)
            mess=mess+"0.09";
        else
            mess=mess+9;
        display(mess);
    }
    public void press6(View view) {
        int don=0;
        if(dona ==1 )
        don=chk();
        if(don==1)
            mess=mess+"0.06";
        else
            mess=mess+6;
        display(mess);
    }
    public void press5(View view) {
        int don=0;
        if(dona ==1 )
        don=chk();
        if(don==1)
            mess=mess+"0.05";
        else
            mess=mess+5;
        display(mess);
    }
    public void press4(View view) {
        int don=0;
        if(dona ==1 )
        don=chk();
        if(don==1)
            mess=mess+"0.04";
        else
            mess=mess+4;
        display(mess);
    }
    public void press3(View view) {
        int don=0;
        if(dona ==1 )
        don=chk();
        if(don==1)
            mess=mess+"0.03";
        else
            mess=mess+3;
        display(mess);
    }
    public void press2(View view) {
        int don=0;
        if(dona ==1 )
            don=chk();
        if(don==1)
            mess=mess+"0.02";
        else
            mess=mess+2;
        display(mess);
    }
    public void press1(View view) {
        int don=0;
        if(dona ==1 )
        don=chk();
        if(don==1)
            mess=mess+"0.01";
        else
            mess=mess+1;
        display(mess);
    }
    public void press0(View view) {
        mess=mess+"0";
        display(mess);
    }
    public void pressC(View view) {
        if (mess.length() > 0)
            mess = mess.substring(0, mess.length()-1);;
        display(mess);
    }
    public void pressBpen(View view) {
        mess=mess+"(";
        display(mess);
    }
    public void pressBlose(View view) {
        mess=mess+")";
        display(mess);
    }
    public void pressAdd(View view) {
        mess=mess+"+";
        display(mess);
    }
    public void pressSub(View view) {
        mess=mess+"-";
        display(mess);
    }
    public void pressPro(View view) {
        mess=mess+"*";
        display(mess);
    }
    public void pressDiv(View view) {
        mess=mess+"/";
        display(mess);
    }
    public void pressPerage(View view) {
        mess=mess+"%";
        dona=1;
        display(mess);
    }
    public void pressClrAll(View view) {
        mess="0";
        display(mess);
        mess="0";
        pressEql(view);
    }
    public void pressEql(View view) {
        String summary="<html><body><script>document.write(eval("+mess+"));</script></body></html>";
        //String summary="\""+summary1+"\"";
        //display(summary);
        WebView myWebView = (WebView) findViewById(R.id.webView);
        WebSettings webSettings = myWebView.getSettings();
        webSettings.setJavaScriptEnabled(true);
        webSettings.setDefaultFontSize(35);
        myWebView.loadData(summary, "text/html", null);
        mess="0";
    }
     /**
     * This method displays the given quantity value on the screen.
     */
    private void display(String exp) {

        TextView expTextView = (TextView) findViewById(R.id.expTextView);
        expTextView.setText("" + exp);

    }


}