package com.example.ajithmarshall.ajith.adapter;

/**
 * Created by ajithmarshall on 05/08/16.
 */

import android.app.Activity;
import android.os.Bundle;
import android.widget.ExpandableListView;

import com.example.ajithmarshall.ajith.R;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class ContactMe extends Activity {
    com.example.ajithmarshall.ajith.adapter.ExpandableListAdapter listAdapter;
    ExpandableListView expListView;
    List<String> listDataHeader;
    List<String> listGrpTime;


    HashMap<String, List<String>> listDataChild;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.contactme);
        // get the listview
        expListView = (ExpandableListView) findViewById(R.id.lvExp);

        // preparing list data
        prepareListData();

        listAdapter = new com.example.ajithmarshall.ajith.adapter.ExpandableListAdapter(this, listDataHeader, listDataChild,listGrpTime);

        // setting list adapter
        expListView.setAdapter(listAdapter);
    }
    private void prepareListData() {
        listDataHeader = new ArrayList<String>();
        listDataChild = new HashMap<String, List<String>>();
        listGrpTime = new ArrayList<String>();
        // Adding Group data
        listDataHeader.add("Engagement");
        listDataHeader.add("Marriage Ceremony");
        listDataHeader.add("The Knot");
        listDataHeader.add("Reception");
        listDataHeader.add("Lunch");
        listGrpTime.add("13/09/16 18.30pm");
        listGrpTime.add("09:30am");
        listGrpTime.add("10:30am-12:00pm");
        listGrpTime.add("12:15pm");
        listGrpTime.add("12:30pm");
        // Adding child data
        List<String> Engagement = new ArrayList<String>();
        Engagement.add("A promise to wed, and also the period of time between a marriage proposal and a marriage. During this period, a couple is said to be betrothed, \"intended\", affianced, engaged to be married, or simply engaged. Future brides and grooms may be called the betrothed, a wife-to-be or husband-to-be, fiancée or fiancé, respectively (from the French word fiancer). The duration of the courtship varies vastly, and is largely dependent on cultural norms or upon the agreement of the parties involved.");
        List<String> MarriageCeremony = new ArrayList<String>();
        MarriageCeremony.add("So as marriage is the convenant,the vows we take are the entrance into that commitment,the first step down the road we travel together in the remaining years  of our lives ");
        List<String> knot = new ArrayList<String>();
        knot.add("It's not just a knot, a bond between us which makes us realise that we are one,during this time tears might just run over our face but remember that they are not for sorrow rather its an unconditional love on our family.");
        List<String> Reception = new ArrayList<String>();
        Reception.add("We are blessed to share our stage with family and friends and are ready to take photos and selfie's and ready with our hands wide open to recieve your gifts whole heartedly");
        List<String> lunch = new ArrayList<String>();
        lunch.add("Have a taste of our wedding specials");
        listDataChild.put(listDataHeader.get(0), Engagement); // Header, Child data
        listDataChild.put(listDataHeader.get(1), MarriageCeremony);
        listDataChild.put(listDataHeader.get(2), knot);
        listDataChild.put(listDataHeader.get(3), Reception);
        listDataChild.put(listDataHeader.get(4), lunch);

    }
}
