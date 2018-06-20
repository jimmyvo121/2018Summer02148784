package edu.httpscsgsu.a2018summer02148784.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.util.Pair;

import java.util.List;

public class AdvancePageAdapter extends FragmentStatePagerAdapter {

    private final List<Pair<String, Fragment>> fragmentList;

    public AdvancePageAdapter(FragmentManager fm, List<Pair<String, Fragment>> fragmentList) {
        super(fm);
        this.fragmentList = fragmentList;
    }

    @Override
    public Fragment getItem(int position) {
        return fragmentList.get(position).second;
    }

    @Override
    public int getCount() {
        return fragmentList.get(position).first;
    }


}