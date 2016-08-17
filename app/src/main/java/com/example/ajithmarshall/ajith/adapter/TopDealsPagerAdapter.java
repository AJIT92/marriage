package com.example.ajithmarshall.ajith.adapter;

/**
 * Created by ajithmarshall on 16/08/16.
 */

import android.content.Context;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;

import com.example.ajithmarshall.ajith.R;
import com.example.ajithmarshall.ajith.ResizableImageView;


/**
 * Created by Sakthikumar on 02-09-2015.
 */
public class TopDealsPagerAdapter extends PagerAdapter {
    // Declare Variables
    Context context;
    LayoutInflater inflater;

    public TopDealsPagerAdapter(Context context) {
        this.context = context;
    }

    @Override
    public int getCount() {
        return 5;
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return view == ((RelativeLayout) object);
    }

    @Override
    public Object instantiateItem(ViewGroup container, final int position) {

        // Declare Variables
        ResizableImageView  image;

        inflater = (LayoutInflater) context
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View itemView = inflater.inflate(R.layout.template_topdeals, container,
                false);

        // Locate the ImageView in viewpager_item.xml
        image = (ResizableImageView) itemView.findViewById(R.id.imgDisplay);
//        placeHolder = (ImageView)itemView.findViewById(R.id.placeholder);

        // Capture position and set to the ImageView
        if (position == 0)
            image.setImageDrawable(context.getResources().getDrawable(R.drawable.victor));
        else if (position == 1)
            image.setImageDrawable(context.getResources().getDrawable(R.drawable.andrea));
        else if (position == 2)
            image.setImageDrawable(context.getResources().getDrawable(R.drawable.ernest));
        else if (position==3)
            image.setImageDrawable(context.getResources().getDrawable(R.drawable.xavier));
        else
            image.setImageDrawable(context.getResources().getDrawable(R.drawable.alexis));



        // Add viewpager_item.xml to ViewPager
        ((ViewPager) container).addView(itemView);

        return itemView;
    }


    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        // Remove viewpager_item.xml from ViewPager
        ((ViewPager) container).removeView((RelativeLayout) object);

    }
}
