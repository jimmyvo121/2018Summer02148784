package edu.httpscsgsu.a2018summer02148784.activity;

import android.app.Fragment;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Pair;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import edu.httpscsgsu.a2018summer02148784.MainActivity;
import edu.httpscsgsu.a2018summer02148784.R;
import edu.httpscsgsu.a2018summer02148784.adapter.AdvancePageAdapter;

public class AdvanceViewPagerActivity extends AppCompatActivity {

    @BindView(R.id.advance_viewpager_title)
    TabLayout title;
    @BindView(R.id.advance_viewpager)
    ViewPager vp;

    private List<Pair<String, Fragment>> fragmentList =new ArrayList<Pair<String,Fragment>>;
    @Override


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_advance_view_pager);
        ButterKnife.bind(this);
    }
//    fragmentList.add(new<Pair<String ,Fragment>> ("First", new WorkDemo()));
//    fragmentList.add(new<Pair<String ,Fragment>> ("Second",new WorkDemo()));
//    fragmentList.add(new<Pair<String ,Fragment>> ("Third",new WorkDemo()));
//    fragmentList.add(new<Pair<String ,Fragment>> ("Fourth",new WorkDemo()));

//    AdvancePageAdapter adapter = new AdvancePageAdapter(getSupportFragmentManager(), fragmentList());
//    vp.setAdapter(adapter);
//    viewPager.set
//    title.setWithViewPager(vp);
}
