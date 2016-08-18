package com.example.ajithmarshall.ajith.adapter;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.view.View.OnClickListener;
import com.example.ajithmarshall.ajith.R;

/**
 * Created by ajithmarshall on 12/08/16.
 */


public class Location extends Activity implements OnClickListener {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.location);
        Button btnch = (Button) findViewById(R.id.church);
        btnch.setOnClickListener(this);

        Button btnhall =(Button)findViewById(R.id.marriagehall);
        btnhall.setOnClickListener(this);
    }
    public void onClick(View v) {
        // TODO Auto-generated method stub
        Intent intent;
        switch (v.getId()) {
            case R.id.marriagehall:
                intent =new Intent(Intent.ACTION_VIEW,
                        Uri.parse("http://maps.google.com/maps?daddr=9.973723,78.1653989"));
                startActivity(intent);
                break;
            case R.id.church:
                intent = new Intent(Intent.ACTION_VIEW,
                        Uri.parse("http://maps.google.com/maps?daddr=9.9809415,78.1706536"));
                startActivity(intent);
                break;

        }
    }
    }


