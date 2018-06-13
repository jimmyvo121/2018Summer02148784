package edu.httpscsgsu.a2018summer02148784.adapter;

import android.support.annotation.NonNull;
import android.support.v4.view.PagerAdapter;
import android.view.View;

import java.util.List;

public class ScaleStyleAdpter extends PagerAdapter {

    private List<View> viewList;

    @Override
    public int getCount() {
        return viewList.size();
    }

    public ScaleStyleAdpter (List<View> viewList){
        this.viewList = viewList;
    }




    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
        return false;
    }
}
