package com.example.himwalk;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
/**
 * Created by Anuj Sharma on 24/05/19.
 */
public class PageAdapter extends FragmentPagerAdapter {
    String[]frag={"First","Second","Third"};
    public PageAdapter(FragmentManager fm) {
        super(fm);
    }


    @Override
    public CharSequence getPageTitle(int position){
        return frag[position];
    }
    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:
                return new ConnectFragment();

            case 1:
                return new FixturesFragment();
            case 2:
                return new TableFragment();


        }
        return null;
    }

    @Override
    public int getCount() {
        return frag.length;
    }
}
