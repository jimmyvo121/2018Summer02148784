package edu.httpscsgsu.a2018summer02148784.activity;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

import java.util.ArrayList;
import edu.httpscsgsu.a2018summer02148784.R;
import edu.httpscsgsu.a2018summer02148784.adapter.ViewPagerAdapter;
import edu.httpscsgsu.a2018summer02148784.fragment.DemoFragment;
import edu.httpscsgsu.a2018summer02148784.fragment.WorkFragment;

public class ViewPagerActivity extends AppCompatActivity {

    private ViewPager viewPager;
    private ArrayList<Fragment> fragmentList = new ArrayList<Fragment>();

    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_view_pager);
        viewPager = findViewById(R.id.viewpager_viewpager);
        fragmentList.add(new DemoFragment());
        fragmentList.add(new WorkFragment());
        ViewPagerAdapter adapter = new ViewPagerAdapter(getSupportFragmentManager(), fragmentList);
        viewPager.setAdapter(adapter);

    }
}
