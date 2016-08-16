package com.example.ajithmarshall.ajith.adapter;

import android.app.Activity;
import android.graphics.Typeface;
import android.os.Bundle;
import android.widget.TextView;

import com.example.ajithmarshall.ajith.R;

/**
 * Created by ajithmarshall on 12/08/16.
 */
public class AboutUs extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.aboutus);
        try {
            TextView tx = (TextView) findViewById(R.id.txtIdeas);
            Typeface custom_font = Typeface.createFromAsset(getAssets(), "fonts/Remac.ttf");
            tx.setTypeface(custom_font);
            tx = (TextView) findViewById(R.id.txtTechnical);
            custom_font = Typeface.createFromAsset(getAssets(), "fonts/Remac.ttf");
            tx.setTypeface(custom_font);
            tx = (TextView) findViewById(R.id.finance);
            custom_font = Typeface.createFromAsset(getAssets(), "fonts/Remac.ttf");
            tx.setTypeface(custom_font);
            tx = (TextView) findViewById(R.id.life);
            custom_font = Typeface.createFromAsset(getAssets(), "fonts/Remac.ttf");
            tx.setTypeface(custom_font);

        } catch (Exception ex) {
            ex.printStackTrace();



        }
    }
}