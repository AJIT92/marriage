package com.example.ajithmarshall.ajith.adapter;

/**
 * Created by ajithmarshall on 05/08/16.
 */

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import com.example.ajithmarshall.ajith.MainActivity;
import com.example.ajithmarshall.ajith.R;

public class SplashScreen extends Activity {

    private static int TIME_OUT = 2000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splashscreen);

        new Handler().postDelayed(new Runnable() {


            @Override
            public void run() {
                Intent i = new Intent(SplashScreen.this, MainActivity.class);
                startActivity(i);
                // close this activity
                finish();
            }
        }, TIME_OUT);
    }

}