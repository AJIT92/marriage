package com.example.ajithmarshall.ajith;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.TextView;

import com.example.ajithmarshall.ajith.adapter.AboutUs;
import com.example.ajithmarshall.ajith.adapter.ContactMe;
import com.example.ajithmarshall.ajith.adapter.Countdown;
import com.example.ajithmarshall.ajith.adapter.Location;
import com.example.ajithmarshall.ajith.adapter.SlowViewPager;
import com.example.ajithmarshall.ajith.adapter.TopDealsPagerAdapter;
import com.google.android.gms.appindexing.Action;
import com.google.android.gms.appindexing.AppIndex;
import com.google.android.gms.common.api.GoogleApiClient;

public class MainActivity extends Activity implements OnClickListener {
    Animation iconAnim;
    /**
     * ATTENTION: This was auto-generated to implement the App Indexing API.
     * See https://g.co/AppIndexing/AndroidStudio for more information.
     */
    private GoogleApiClient client;
    int currentPageIndicator = 0;
    Handler handler;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        try {
            TextView tx = (TextView) findViewById(R.id.textView);
            Typeface custom_font = Typeface.createFromAsset(getAssets(), "fonts/Game of Thrones.ttf");
            tx.setTypeface(custom_font);
            tx =(TextView)findViewById(R.id.invitation);
            custom_font = Typeface.createFromAsset(getAssets(), "fonts/Remac.ttf");
            tx.setTypeface(custom_font);
            tx = (TextView)findViewById(R.id.countdown);
            custom_font = Typeface.createFromAsset(getAssets(), "fonts/Remac.ttf");
            tx.setTypeface(custom_font);
            tx=(TextView)findViewById(R.id.menu);
            custom_font = Typeface.createFromAsset(getAssets(), "fonts/Remac.ttf");
            tx.setTypeface(custom_font);
            tx=(TextView)findViewById(R.id.button);
            custom_font = Typeface.createFromAsset(getAssets(), "fonts/Remac.ttf");
            tx.setTypeface(custom_font);
            tx=(TextView)findViewById(R.id.aboutus);
            custom_font = Typeface.createFromAsset(getAssets(), "fonts/Remac.ttf");
            tx.setTypeface(custom_font);

        } catch (Exception ex) {
            ex.printStackTrace();
        }

        Button btnInvite = (Button) findViewById(R.id.invitation);
        Button btncountdown = (Button) findViewById(R.id.countdown);
        Button btnschedule = (Button) findViewById(R.id.menu);
        Button btnmap = (Button) findViewById(R.id.button);
        Button btnaboutus = (Button) findViewById(R.id.aboutus);
        final SlowViewPager slider =(SlowViewPager) findViewById(R.id.pager);
        iconAnim = AnimationUtils.loadAnimation(getApplicationContext(),
                R.anim.iconanime);
        TopDealsPagerAdapter topDealsPagerAdapter = new TopDealsPagerAdapter(this);
        slider.setAdapter(topDealsPagerAdapter);

        handler = new Handler();
        final Runnable r = new Runnable() {
            //            int i=0;
            public void run() {
                slider.setCurrentItem(currentPageIndicator,true);
                handler.postDelayed(this, 3000);
                currentPageIndicator++;
                currentPageIndicator%=5;
            }
        };
        handler.postDelayed(r, 3000);




        btnInvite.startAnimation(iconAnim);
        btncountdown.setAnimation(iconAnim);
        btnschedule.setAnimation(iconAnim);
        btnmap.setAnimation(iconAnim);
        btnaboutus.setAnimation(iconAnim);
        btnaboutus.setOnClickListener(this);
        btnInvite.setOnClickListener(this);
        btnschedule.setOnClickListener(this);
        btncountdown.setOnClickListener(this);
        btnmap.setOnClickListener(this);


        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        client = new GoogleApiClient.Builder(this).addApi(AppIndex.API).build();
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.credits, menu);
        // Inflate the menu; this adds items to the action bar if it is present.
        MenuItem item = menu.findItem(R.id.credits);
        item.setTitle("My App");
//		Log.d("Tag", "Hello"+item);
//		if(android.os.Build.VERSION.SDK_INT > android.os.Build.VERSION_CODES.HONEYCOMB_MR2)
//			item.setVisible(true);
//		else
//			item.setVisible(false);

        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        Intent intent = new Intent(getApplicationContext(), AboutUs.class);
        startActivity(intent);
        return false;
    }


    @Override
    public void onClick(View v) {
        // TODO Auto-generated method stub
        Intent intent;
        switch (v.getId()) {
            case R.id.invitation:
                intent = new Intent(getApplicationContext(), Invitation.class);
                startActivity(intent);
                break;
            case R.id.countdown:
                intent = new Intent(getApplicationContext(), Countdown.class);
                startActivity(intent);
                break;
            case R.id.aboutus:
                intent = new Intent(getApplicationContext(), AboutUs.class);
                startActivity(intent);
                break;
            case R.id.button:
                intent =new Intent(getApplicationContext(), Location.class);
                startActivity(intent);
                break;
            case R.id.menu:
                intent = new Intent(getApplicationContext(), ContactMe.class);
                startActivity(intent);
                break;

        }
    }

    @Override
    public void onStart() {
        super.onStart();

        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        client.connect();
        Action viewAction = Action.newAction(
                Action.TYPE_VIEW, // TODO: choose an action type.
                "Main Page", // TODO: Define a title for the content shown.
                // TODO: If you have web page content that matches this app activity's content,
                // make sure this auto-generated web page URL is correct.
                // Otherwise, set the URL to null.
                Uri.parse("http://host/path"),
                // TODO: Make sure this auto-generated app URL is correct.
                Uri.parse("android-app://com.example.ajithmarshall.ajith/http/host/path")
        );
        AppIndex.AppIndexApi.start(client, viewAction);
    }

    @Override
    public void onStop() {
        super.onStop();

        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        Action viewAction = Action.newAction(
                Action.TYPE_VIEW, // TODO: choose an action type.
                "Main Page", // TODO: Define a title for the content shown.
                // TODO: If you have web page content that matches this app activity's content,
                // make sure this auto-generated web page URL is correct.
                // Otherwise, set the URL to null.
                Uri.parse("http://host/path"),
                // TODO: Make sure this auto-generated app URL is correct.
                Uri.parse("android-app://com.example.ajithmarshall.ajith/http/host/path")
        );
        AppIndex.AppIndexApi.end(client, viewAction);
        client.disconnect();
    }
}

