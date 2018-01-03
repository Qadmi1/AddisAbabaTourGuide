package com.example.appty.addidababatourguide;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by appty on 30/12/17.
 */


public class PagerAdapter extends FragmentPagerAdapter {

    private Context mContext;


    public PagerAdapter(Context context, FragmentManager fm) {
        super(fm);
        mContext = context;
    }

    /**
     * Return the {@link Fragment} that should be displayed for the given page number.
     */
    @Override
    public Fragment getItem(int position) {
        if (position == 1) {
            return new LandMarks_Fragment();
        }
        else if (position ==2)
        {
            return new RestaurantFragment();
        }
        else if (position ==3)
        {
            return new HistoricSitesFragment();
        }

        else if (position ==4) {
            return new ReligeiousSitesFragment();
        }
        else
            return new HomeFragment();
    }

    /**
     * Return the total number of pages.
     */
    @Override
    public int getCount() {
        return 5;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        if (position == 1) {
            return mContext.getString(R.string.landmarks);
        }
        else if (position ==2)
        {
            return mContext.getString(R.string.restaurants);
        }
        else if (position ==3)
        {
            return mContext.getString(R.string.historic);
        }
        else if (position ==4)
        {
            return mContext.getString(R.string.religious);
        }
        else
            return mContext.getString(R.string.home);    }
}