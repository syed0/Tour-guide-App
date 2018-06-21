package com.example.tourguide.tourguide;

import android.net.Uri;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity implements food.OnFragmentInteractionListener, events.OnFragmentInteractionListener, restraunts.OnFragmentInteractionListener, tourist_places.OnFragmentInteractionListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TabLayout tab = findViewById(R.id.tablayout);
        tab.addTab(tab.newTab().setText(R.string.tab1));
        tab.addTab(tab.newTab().setText(R.string.tab2));
        tab.addTab(tab.newTab().setText(R.string.tab3));
        tab.addTab(tab.newTab().setText(R.string.tab4));
        final ViewPager viewPager = findViewById(R.id.viewpager);
        final PagerAdapter pagerAdapter = new PagerAdapter(getSupportFragmentManager(), tab.getTabCount());
        viewPager.setAdapter(pagerAdapter);
        viewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tab));
        tab.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                viewPager.setCurrentItem(tab.getPosition());
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });
    }

    @Override
    public void onFragmentInteraction(Uri uri) {

    }
}
