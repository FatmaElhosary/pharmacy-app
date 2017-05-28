package com.example.awqer.send;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends Activity {
    final static String msg_key="fatma.com.example.awqer.send.msg_key";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.second_layout);
        Intent intent=getIntent();
        String message=intent.getStringExtra(msg_key);
        TextView textView=new TextView(this);
        textView.setTextSize(50);
        textView.setText(message);
        setContentView(textView);
    }
}
