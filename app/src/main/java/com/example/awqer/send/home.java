package com.example.awqer.send;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

/**
 * Created by Awqer on 5/28/2017.
 */

public class home extends Activity{


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home);

        Button b = (Button) findViewById(R.id.button);
        ImageButton b1 = (ImageButton) findViewById(R.id.button1);
        ImageButton b2 = (ImageButton) findViewById(R.id.button2);
        ImageButton b3 = (ImageButton) findViewById(R.id.button3);
        ImageButton b4 = (ImageButton) findViewById(R.id.button4);

        b4.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent Intent = new Intent(v.getContext(), send.class);
                v.getContext().startActivity(Intent);}
        });
        b1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Toast.makeText(getBaseContext(),"مرحبا",Toast.LENGTH_LONG).show();
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Toast.makeText(getBaseContext(),"مرحبا",Toast.LENGTH_LONG).show();
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Toast.makeText(getBaseContext(),"مرحبا",Toast.LENGTH_LONG).show();
            }
        });

    }




/*

    public void ButtonOnClick(View v) {
        switch (v.getId()) {
            case R.id.button1:
                Toast.makeText(getBaseContext(),"مرحبا",Toast.LENGTH_LONG).show();
                break;
            case R.id.button2:
               // doSomething2();
                break;
            case R.id.button3:
                // doSomething2();
                break;
            case R.id.button4:

                break;
        }
    }
*/

}



