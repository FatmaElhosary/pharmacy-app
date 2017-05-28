package com.example.awqer.send;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class send extends AppCompatActivity {
    EditText message_text;
    final static String msg_key="fatma.com.example.awqer.send.msg_key";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_send_layout);
    }
    public void sendMessage(View view){
        message_text=(EditText)findViewById(R.id.message_txt);
        String msg=message_text.getText().toString();
        Intent intent=new Intent(this,SecondActivity.class);
        intent.putExtra(msg_key,msg);
        startActivity(intent);
    }

}
