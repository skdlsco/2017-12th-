package com.example.eka.alarm;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by eka on 2017. 4. 2..
 */

public class PagerAdapter extends FragmentPagerAdapter {
    public PagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0: return new main();
            case 1: return new alarm_page();
        }
        return null;
    }

    @Override
    public int getCount() {
        return 2;
    }
}
