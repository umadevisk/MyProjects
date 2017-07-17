package com.app.exampleseven.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import com.app.exampleseven.fragments.FragmentPageOne;
import com.app.exampleseven.model.TabItem;

import java.util.ArrayList;

public class TabLayoutAdapter extends FragmentStatePagerAdapter {

    private ArrayList<TabItem> list;

    public TabLayoutAdapter(FragmentManager fm, ArrayList<TabItem> list) {
        super(fm);
        this.list = list;
    }

    @Override
    public Fragment getItem(int pos) {
        switch (pos) {
            case 0:
                return FragmentPageOne.newInstance();
            default:
                return FragmentPageOne.newInstance();
        }
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return list.get(position).Videos;
    }

    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public int getItemPosition(Object object) {
        return super.getItemPosition(object);
    }
}