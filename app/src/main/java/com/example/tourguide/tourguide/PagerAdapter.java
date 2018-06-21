package com.example.tourguide.tourguide;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class PagerAdapter extends FragmentPagerAdapter {

    int mnoOftabes;

    public PagerAdapter(FragmentManager fm, int noOftabes) {
        super(fm);
        this.mnoOftabes = noOftabes;
    }

    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                food food = new food();
                return food;
            case 1:
                tourist_places tourist_places = new tourist_places();
                return tourist_places;
            case 2:
                restraunts restraunts = new restraunts();
                return restraunts;
            case 3:
                events events = new events();
                return events;
            default:
                return null;

        }

    }

    @Override
    public int getCount() {
        return mnoOftabes;
    }
}
