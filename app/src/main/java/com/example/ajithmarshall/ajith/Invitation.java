package com.example.ajithmarshall.ajith;

/**
 * Created by ajithmarshall on 12/08/16.
 */

import android.app.ActionBar;
import android.app.FragmentTransaction;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.Menu;
import android.view.MenuItem;

import com.example.ajithmarshall.ajith.adapter.FragmentInvite;
import com.example.ajithmarshall.ajith.adapter.FragmentProgram;
import com.google.android.gms.appindexing.Action;
import com.google.android.gms.appindexing.AppIndex;
import com.google.android.gms.common.api.GoogleApiClient;

/**
 * Created by ajithmarshall on 05/08/16.
 */

public class Invitation extends FragmentActivity implements ActionBar.TabListener {


    ActionBar actionBar;
    ViewPager viewPager;
    Context ctx;

    /**
     * ATTENTION: This was auto-generated to implement the App Indexing API.
     * See https://g.co/AppIndexing/AndroidStudio for more information.
     */
    private GoogleApiClient client;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.invitation);
        actionBar = getActionBar();

        // Creation of first Tab


        viewPager = (ViewPager) findViewById(R.id.swiper);
        ActionBar.Tab tabInvite = actionBar.newTab();
        tabInvite.setText("Invitation");
        tabInvite.setTabListener(this);

        // Creation of second Tab
        ActionBar.Tab tabProgram = actionBar.newTab();
        tabProgram.setText("Programme");
        tabProgram.setTabListener(this);

        actionBar.addTab(tabInvite);
        actionBar.addTab(tabProgram);
        viewPager.setAdapter(new MyAdapter(getSupportFragmentManager()));// constructor
        // adapter
        // requires
        // fragment
        // manger

        viewPager.setOnPageChangeListener(new ViewPager.OnPageChangeListener() {

            @Override
            public void onPageSelected(int pageNo) {
                // TODO Auto-generated method stub
                // page selected by user is 1 then tab selected should be number
                // 1 is what it does here
                actionBar.setSelectedNavigationItem(pageNo);
            }

            @Override
            public void onPageScrolled(int arg0, float arg1, int arg2) {
                // TODO Auto-generated method stub

            }

            @Override
            public void onPageScrollStateChanged(int arg0) {
                // TODO Auto-generated method stub
                if (arg0 == ViewPager.SCROLL_STATE_IDLE) {
                    // Log.d("idle", "is now idle");
                } else if (arg0 == ViewPager.SCROLL_STATE_DRAGGING) {
                    // Log.d("drag", "dragging now");
                } else if (arg0 == ViewPager.SCROLL_STATE_SETTLING) {
                    // Log.d("settle", "Settling now");
                }
            }
        });


        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        client = new GoogleApiClient.Builder(this).addApi(AppIndex.API).build();
    }
//	public boolean onPrepareOptionsMenu(Menu menu){
//		MenuItem item = menu.findItem(R.id.menu);
//		if(android.os.Build.VERSION.SDK_INT <= android.os.Build.VERSION_CODES.ICE_CREAM_SANDWICH)
//			item.setVisible(true);
//		else
//			item.setVisible(false);
//		return true;
//	}

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main, menu);
        // Inflate the menu; this adds items to the action bar if it is present.
        MenuItem item = menu.findItem(R.id.action_settings);
//		Log.d("Tag", "Hello"+item);
//		if(android.os.Build.VERSION.SDK_INT > android.os.Build.VERSION_CODES.HONEYCOMB_MR2)
//			item.setVisible(true);
//		else
//			item.setVisible(false);

        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public void onStart() {
        super.onStart();

        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        client.connect();
        Action viewAction = Action.newAction(
                Action.TYPE_VIEW, // TODO: choose an action type.
                "Invitation Page", // TODO: Define a title for the content shown.
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
                "Invitation Page", // TODO: Define a title for the content shown.
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


    class MyAdapter extends FragmentPagerAdapter {

        public MyAdapter(FragmentManager fm) {
            super(fm);
            // TODO Auto-generated constructor stub
        }

        @Override
        public Fragment getItem(int arg0) {
            // TODO Auto-generated method stub
            Fragment fragment = null;
            // if at position 0 then return fragment 1
            if (arg0 == 0) {
                fragment = new FragmentInvite();
            }
            // if at position 1 then return fragment 2
            else if (arg0 == 1) {
                fragment = new FragmentProgram();
            }

            return fragment;
        }

        @Override
        // tells viewPager how many pages are there
        public int getCount() {
            // TODO Auto-generated method stub
            return 2;
        }

    }

    @Override
    public void onTabReselected(ActionBar.Tab tab, FragmentTransaction ft) {
        // TODO Auto-generated method stub

    }

    @Override
    public void onTabSelected(ActionBar.Tab tab, FragmentTransaction ft) {
        // TODO Auto-generated method stub
        // particular tab changes ,changing the view page
        viewPager.setCurrentItem(tab.getPosition());
    }

    @Override
    public void onTabUnselected(ActionBar.Tab tab, FragmentTransaction ft) {
        // TODO Auto-generated method stub

    }
}

