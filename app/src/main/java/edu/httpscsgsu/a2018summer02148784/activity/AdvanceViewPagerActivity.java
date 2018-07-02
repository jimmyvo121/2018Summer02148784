package edu.httpscsgsu.a2018summer02148784.activity;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.util.Pair;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import edu.httpscsgsu.a2018summer02148784.R;
import android.support.v4.app.Fragment;
import edu.httpscsgsu.a2018summer02148784.adapter.AdvancePageAdapter;
import edu.httpscsgsu.a2018summer02148784.fragment.Test1Fragment;
import edu.httpscsgsu.a2018summer02148784.fragment.WorkFragment;

public class AdvanceViewPagerActivity extends AppCompatActivity{

    @BindView(R.id.advance_viewpager_title)
    TabLayout title;
    @BindView(R.id.advance_viewpager)
    ViewPager vp;
    private List<Pair<String, Fragment>> fragmentList = new ArrayList<>();



    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_advance_view_pager);
        ButterKnife.bind(this);

        fragmentList.add(new Pair<String , Fragment> ("First", new WorkFragment()));
        fragmentList.add(new Pair<String , Fragment> ("Second",new Test1Fragment()));
        fragmentList.add(new Pair<String , Fragment> ("Third",new WorkFragment()));
        fragmentList.add(new Pair<String , Fragment> ("Fourth",new Test1Fragment()));

        AdvancePageAdapter adapter = new AdvancePageAdapter(getSupportFragmentManager(), fragmentList);
        vp.setAdapter(adapter);
        title.setupWithViewPager(vp);
    }




}
